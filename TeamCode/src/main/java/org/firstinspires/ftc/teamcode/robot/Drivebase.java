package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.Arrays;
import java.util.List;

public class Drivebase {

    // Constructing the 4 motors used on a mecanum drive
    public DcMotor leftFrontDrive;
    public DcMotor leftBackDrive;
    public DcMotor rightFrontDrive;
    public DcMotor rightBackDrive;

    public Drivebase(HardwareMap hardwareMap, Telemetry telemetry){

        // Gets the motor from the hub, make sure the name matches the config on the Driver hub
        // TODO: Find out the names of each motor in the active Drive hub config
        leftFrontDrive = hardwareMap.get(DcMotor.class, "");
        leftBackDrive = hardwareMap.get(DcMotor.class, "");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "");
        rightBackDrive = hardwareMap.get(DcMotor.class, "");

        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.update();
    }

    // TODO: Do some math and send power to the motors based on controller input
    // hint google mecanum drive code
    public void calculateDrivePowers(double y, double x, double rot){

        setDrivePowers();
    }


    // Sends power to the drive motors
    public void setDrivePowers(double lf, double lb, double rf, double rb){
        leftFrontDrive.setPower(lf);
        leftBackDrive.setPower(lb);
        rightFrontDrive.setPower(rf);
        rightBackDrive.setPower(rb);
    }

}
