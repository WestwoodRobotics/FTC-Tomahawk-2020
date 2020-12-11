package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.teamcode.TomahawkAutonRed;
@Autonomous(name="Basic: Auton", group="Linear Auton")
public class TomahawkAutonRed extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftFrontDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor leftBackDrive = null;
    private DcMotor rightBackDrive = null;
    private DcMotor intake = null;
    private DcMotor shooter = null;
    private DcMotor conveyor = null;

    double leftFrontPower;
    double rightFrontPower;
    double leftBackPower;
    double rightBackPower;
    double intakepwr;
    double shooterpwr;
    double conveyorpwr;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Initialize the hardware variables. Note that the strings used here as parameters
        // to 'get' must correspond to the names assigned during the robot configuration
        // step (using the FTC Robot Controller app on the phone).
        leftFrontDrive  = hardwareMap.get(DcMotor.class, "leftFront");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "rightFront");
        leftBackDrive= hardwareMap.get(DcMotor.class, "leftBack");
        rightBackDrive= hardwareMap.get(DcMotor.class, "rightBack");
        intake = hardwareMap.get(DcMotor.class, "intake");
        shooter = hardwareMap.get(DcMotor.class, "shooter");
        conveyor = hardwareMap.get(DcMotor.class, "conveyor");
        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        // Most robots need the motor on one side to be reversed to drive forward
        // Reverse the motor that runs backwards when connected directly to the battery
        leftFrontDrive.setDirection(DcMotor.Direction.REVERSE);
        rightFrontDrive.setDirection(DcMotor.Direction. FORWARD);
        leftBackDrive.setDirection(DcMotor.Direction. FORWARD);
        rightBackDrive.setDirection(DcMotor.Direction. REVERSE);
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        runtime.reset();
        AutonFunction functions = new AutonFunction(leftFrontDrive, rightFrontDrive, leftBackDrive, rightBackDrive, shooter, runtime, conveyor);
        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            // edit shooter power later

            //get to easy spot
            functions.goForward(54);
            //align with 1st power shot
            functions.goLeft(20.25);
            //power shot
            functions.shoot(0);
            //align with 2nd power shot
            functions.goRight(7.5);
            functions.shoot(0);
            //align with 3rd power shot
            functions.goRight(7.5);
            functions.shoot(0);

            //Park on white line
            functions.goForward(21);
        }
    }
}
