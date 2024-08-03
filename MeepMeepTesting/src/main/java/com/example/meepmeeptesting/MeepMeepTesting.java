package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(0, 0, Math.toRadians(90)))
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

                .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}