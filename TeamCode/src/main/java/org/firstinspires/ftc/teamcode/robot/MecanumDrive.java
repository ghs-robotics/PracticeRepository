package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;



public class MecanumDrive {

    // Constructing the 4 motors used on a mecanum drive
    public DcMotor leftFrontDrive;
    public rightFrontDrive;
    public DcMotor rightBackDrive

    public MecanumDrive(HardwareMap hardwareMap, Telemetry telemetry){

        leftFrontDrive = hardwareMap.get(DcMotor.class,
        leftBackDrive = hardwareMap.get(DcMotor.class, "");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "");
         = hardwareMap.get(DcMotor.class, "");

        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.update();
    }
    // todo write a metaDrive function that takes in controller input and alters the inputs
    //      sent calculateDrivePowers so that the robot is always driving straight relative to
    //      its starting position.
    // hint: use the gyro heading.

    public calculateDrivePowers(double y, double x, double rot){

        setDrivePowers();



    // Sends power to the drive motors
    public void setDrivePowers(double lf, double lb, double rf, double rb){
        leftFrontDrive.setPower(lf);
        Drive.setPower(lb);
        rightFrontDrivesetPower(rf);
        rightBackDrive.setPower(rb);
    }


