package com.example.Training.idea;

class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article oA) {
        int sizeComparison = Integer.compare(this.size, oA.size);
        if (sizeComparison != 0) {
            return sizeComparison;
        } else {
            return this.title.compareTo(oA.title);
        }
    }

/*    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Article article = (Article) obj;
        return size == article.size && title.equals(article.title);
    }*/
}