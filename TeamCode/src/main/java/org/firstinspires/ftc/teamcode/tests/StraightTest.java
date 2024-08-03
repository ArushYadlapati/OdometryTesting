package org.firstinspires.ftc.teamcode.tests;
import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.SequentialAction;
import com.acmerobotics.roadrunner.Vector2d;
import com.acmerobotics.roadrunner.ftc.Actions;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.teamcode.roadrunner.MecanumDrive;

@Config
@Autonomous(name = "Straight Test", group = "Autonomous")
public class StraightTest extends LinearOpMode {

    @Override
    public void runOpMode() {
        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, Math.toRadians(90)));

        Action trajectorySequence = drive.actionBuilder(drive.pose)
                .strafeTo(new Vector2d(0, 48))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(24, 24 * Math.sqrt(3)))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(24 * Math.sqrt(3), 24))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(48, 0))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(24 * Math.sqrt(3), -24))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(24, -24 * Math.sqrt(3)))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(0, -48))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(-24, -24 * Math.sqrt(3)))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(-24 * Math.sqrt(3), -24))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(-48, 0))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(-24 * Math.sqrt(3), 24))
                .strafeTo(new Vector2d(0, 0))

                .strafeTo(new Vector2d(-24, 24 * Math.sqrt(3)))
                .strafeTo(new Vector2d(0, 0))

                .build();

        waitForStart();

        if (isStopRequested()) return;

        Actions.runBlocking(
                new SequentialAction(
                        trajectorySequence
                )
        );
    }
}
