package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class AutonFunction {

    ElapsedTime runtime;


    DcMotor leftFrontDrive;
    DcMotor rightFrontDrive;
    DcMotor leftBackDrive;
    DcMotor rightBackDrive;

    public AutonFunction(DcMotor leftFrontDrive, DcMotor rightFrontDrive,
                         DcMotor leftBackDrive, DcMotor rightBackDrive,
                         ElapsedTime runtime){

        this.leftFrontDrive = leftFrontDrive;
        this.rightFrontDrive = rightFrontDrive;
        this.leftBackDrive = leftBackDrive;
        this.rightBackDrive = rightBackDrive;
        this.runtime = runtime;

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
    public void stop(){
        leftFrontDrive.setPower(0);
        leftBackDrive.setPower(0);
        rightFrontDrive.setPower(0);
        rightBackDrive.setPower(0);
    }
}
