package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
//Assumes Robot moves 4ft every 10 sec
public class AutonFunction {

    ElapsedTime runtime;

    DcMotor leftFrontDrive;
    DcMotor rightFrontDrive;
    DcMotor leftBackDrive;
    DcMotor rightBackDrive;

    DcMotor shooter;
    DcMotor belt;

    public AutonFunction(DcMotor leftFrontDrive, DcMotor rightFrontDrive,
                         DcMotor leftBackDrive, DcMotor rightBackDrive, DcMotor shooter,
                         ElapsedTime runtime, DcMotor belt){

        this.leftFrontDrive = leftFrontDrive;
        this.rightFrontDrive = rightFrontDrive;
        this.leftBackDrive = leftBackDrive;
        this.rightBackDrive = rightBackDrive;
        this.shooter = shooter;
        this.runtime = runtime;
        this.belt = belt;

    }
    public void goForward(double inches){
        runtime.reset();
        leftFrontDrive.setPower(1);
        leftBackDrive.setPower(1);
        rightFrontDrive.setPower(1);
        rightBackDrive.setPower(1);
        double seconds = 4.8*inches;
        while(runtime.seconds()<seconds){

        }
        stop();
    }

    public void goBack(double inches){
        runtime.reset();
        leftFrontDrive.setPower(-1);
        leftBackDrive.setPower(-1);
        rightFrontDrive.setPower(-1);
        rightBackDrive.setPower(-1);
        double seconds = 4.8*inches;
        while(runtime.seconds()<seconds){

        }
        stop();
    }

    public void goLeft(double inches){
        runtime.reset();
        leftFrontDrive.setPower(-1);
        leftBackDrive.setPower(1);
        rightFrontDrive.setPower(1);
        rightBackDrive.setPower(-1);
        double seconds = 4.8*inches;
        while(runtime.seconds()<seconds){
        }
        stop();
    }

    public void goRight(double inches){
        runtime.reset();
        leftFrontDrive.setPower(1);
        leftBackDrive.setPower(-1);
        rightFrontDrive.setPower(-1);
        rightBackDrive.setPower(1);
        double seconds = 4.8*inches;
        while(runtime.seconds()<seconds){

        }
        stop();
    }

    public void turnCenterRight(double degree){
        runtime.reset();
        leftFrontDrive.setPower(-1);
        leftBackDrive.setPower(-1);
        rightFrontDrive.setPower(1);
        rightBackDrive.setPower(1);
        double seconds = 0;
        while(runtime.seconds()<seconds){

        }
        stop();
    }

    public void turnCenterLeft(double degrees){
        runtime.reset();
        leftFrontDrive.setPower(1);
        leftBackDrive.setPower(1);
        rightFrontDrive.setPower(-1);
        rightBackDrive.setPower(-1);
        double seconds = 0;
        while(runtime.seconds()<seconds){

        }
        stop();
    }

    public void shoot(double power){
        runtime.reset();
        shooter.setPower(-1);
        //needs adjustment later
        double seconds = 5;
        // add angling servo and conveyor
        while(runtime.seconds()<seconds){

        }
        stop();
    }

    public void stop(){
        leftFrontDrive.setPower(0);
        leftBackDrive.setPower(0);
        rightFrontDrive.setPower(0);
        rightBackDrive.setPower(0);
    }
}
