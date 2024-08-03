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
public class CombinedTest extends LinearOpMode {

    @Override
    public void runOpMode() {
        MecanumDrive drive = new MecanumDrive(hardwareMap, new Pose2d(0, 0, Math.toRadians(90)));

        Action trajectorySequence = drive.actionBuilder(drive.pose)
                .strafeToSplineHeading(new Vector2d(-48, -48), Math.toRadians(0))

                .strafeTo(new Vector2d(-24, 24 * Math.sqrt(3)))
                .setTangent(0)

                .splineToSplineHeading(new Pose2d(48, 48, Math.toRadians(90)), Math.PI / 2)

                .strafeToSplineHeading(new Vector2d(-48, 48), Math.toRadians(270))

                .turnTo(Math.toRadians(315))

                .splineTo(new Vector2d(-48, 12), Math.PI / 6)

                .splineToSplineHeading(new Pose2d(48, -6, Math.toRadians(215)), Math.PI / 3)

                .setReversed(true)

                .splineToSplineHeading(new Pose2d(6, -48, Math.toRadians(215)), Math.PI / 4)
                .splineTo(new Vector2d(36, -18), Math.PI / 2)

                .strafeToLinearHeading(new Vector2d(24, 24), Math.toRadians(0))

                .turnTo(Math.toRadians(45))
                .lineToX(0)
                .turn(Math.toRadians(45))

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
