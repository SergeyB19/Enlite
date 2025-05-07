package com.example.Training.idea;

import java.util.Scanner;

class MotorStaticFactory {

    /**
     * It returns an initialized motor according to the specified type by the first character:
     * 'P' or 'p' - pneumatic, 'H' or 'h' - hydraulic, 'E' or v - electric, 'W' or 'w' - warp.
     */
    public static Motor make(char type, String model, long power) {
        Motor motor = null;
        type = Character.toLowerCase(type);
        switch (type) {
            case 'p' -> motor = new PneumaticMotor(type,model, power);
            case 'h' -> motor = new HydraulicMotor(type,model, power);
            case 'e' -> motor = new ElectricMotor(type,model, power);
            case 'w' -> motor = new WarpDrive(model, power);
            default -> motor = null;
        }
        return motor;
    }


}

/* Do not change code below */
class Motor {

    String model;
    long power;

    public Motor(String model, long power) {
        this.model = model;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}

class PneumaticMotor extends Motor {

    public PneumaticMotor(char type, String model, long power) {
        super(model, power);
    }
}

class HydraulicMotor extends Motor {

    public HydraulicMotor(char type, String model, long power) {
        super(model, power);
    }
}

class ElectricMotor extends Motor {

    public ElectricMotor(char type, String model, long power) {
        super(model, power);
    }
}

class WarpDrive extends Motor {

    public WarpDrive(String model, long power) {
        super(model, power);
    }
}

class MotorMain {


    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final char type = scanner.next().charAt(0);
        final String model = scanner.next();
        final long power = scanner.nextLong();
        final Motor motor = MotorStaticFactory.make(type, model, power);
        if (motor == null) {
            System.out.println(motor);
        } else {
            System.out.println(motor.getClass().getName() + " " + motor.model + " " + motor.power);
        }
    }
}

