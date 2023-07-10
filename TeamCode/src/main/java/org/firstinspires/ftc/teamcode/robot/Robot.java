package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Robot {
    MecanumDrive drive;

    public Robot (HardwareMap hardwareMap, Telemetry telemetry){
        drive = new MecanumDrive(hardwareMap, telemetry);
    }
}
