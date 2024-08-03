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
@Autonomous(name = "Combined Test", group = "Autonomous")
public class SplineTest extends LinearOpMode {

    @Override
    public void runOpMode() {
        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, Math.toRadians(90)));

        Action trajectorySequence = drive.actionBuilder(drive.pose)
                .strafeToSplineHeading(new Vector2d(-48, -48), Math.toRadians(0))

                .setTangent(0)
                .splineToSplineHeading(new Pose2d(48, 48, Math.toRadians(90)), Math.PI / 2)

                .setTangent(0)
                .setReversed(true)
                .splineTo(new Vector2d(24, 24), Math.PI / 2)

                .setTangent(0)
                .setReversed(false)
                .splineToConstantHeading(new Vector2d(0, 36), Math.PI / 2)

                .turnTo(Math.toRadians(180))

                .splineTo(new Vector2d(-48, 48), Math.PI / 2)

                .splineTo(new Vector2d(0, 0), Math.PI / 2)

                .strafeToSplineHeading(new Vector2d(-48, -48), Math.toRadians(0))

                .setTangent(0)
                .splineToSplineHeading(new Pose2d(48, 48, Math.toRadians(90)), Math.PI / 2)

                .setTangent(0)
                .setReversed(true)
                .splineTo(new Vector2d(24, 24), Math.PI / 2)

                .setTangent(0)
                .setReversed(false)
                .splineToConstantHeading(new Vector2d(0, 36), Math.PI / 2)

                .turnTo(Math.toRadians(180))

                .splineTo(new Vector2d(-48, 48), Math.PI / 2)

                .splineTo(new Vector2d(0, 0), Math.PI / 2)

                .build();

        waitForStart();

        if (isStopRequested()) return;

        Actions.runBlocking(
                new SequentialAction(
                        trajectorySequence,
                        trajectorySequence,
                        trajectorySequence
                )
        );
    }
}
