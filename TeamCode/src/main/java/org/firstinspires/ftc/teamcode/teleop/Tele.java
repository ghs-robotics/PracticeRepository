package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.Drivebase;

@TeleOp
public class Tele extends LinearOpMode {

    Drivebase robot;

    @Override
    public void runOpMode() throws InterruptedException {
        robot = new Drivebase(hardwareMap, telemetry);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){
            // TODO: call the calculate drive method and put controls that will drive the robot

            telemetry.update();
        }
    }
}
