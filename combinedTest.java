// Combined Test
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
.turn(Math.toRadians(-45))

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
.turn(Math.toRadians(-45))

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
.turn(Math.toRadians(-45))