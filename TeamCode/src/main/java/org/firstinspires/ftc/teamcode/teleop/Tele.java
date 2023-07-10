package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.robot.MecanumDrive;
import org.firstinspires.ftc.teamcode.robot.Robot;

@TeleOp
public class Tele extends LinearOpMode {

    Robot robot;

    @Override
    public void runOpMode() throws InterruptedException {
        // todo define the robot constructor here

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){

            // todo call your function here
            // hint: gamepad1 is the controller input for driving on our team

            telemetry.update();
        }
    }
}
