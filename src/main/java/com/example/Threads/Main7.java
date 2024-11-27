package com.example.Threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main7 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        int[] list = new int[1_000_000];
        int max = 0;
        for (int i = 0; i < 1_000_000; i++) {
            list[i] = (int) (Math.random() * 1_000_000);
            max = Math.max(max, list[i]);

        }
        System.out.println("Max is " + max);
        System.out.println("Max is using ForkJoin is " + findMax(list));
    }

    private static int findMax(int[] list) {
        RecursiveTask<Integer> recursiveTask = new FindingMax(0, list.length, list);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        return forkJoinPool.invoke(recursiveTask);
    }
}

class FindingMax extends RecursiveTask<Integer> {
    int l;
    int r;
    int[] list;

    public FindingMax(int l, int r, int[] list) {
        this.l = l;
        this.r = r;
        this.list = list;
    }

    @Override
    protected Integer compute() {
        if (r - l < 1000) {
            int curr_max = 0;
            for (int i = 0; i < r; i++) {
                curr_max = Math.max(curr_max, list[i]);
            }
            return curr_max;

        } else {
            int mid = (l + r) / 2;
            RecursiveTask<Integer> left = new FindingMax(l, mid, list);
            RecursiveTask<Integer> right = new FindingMax(mid, r, list);

            left.fork();
            right.fork();

            return Math.max(left.join(), right.join());
        }
    }
}