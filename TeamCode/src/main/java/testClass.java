import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(name = "RcCar")
public class testClass extends OpMode {
    DcMotor motor0;
    DcMotor motor1;
    DcMotor motor2;
    DcMotor motor3;

    @Override
    public void init() {
        motor0 = hardwareMap.dcMotor.get("motor0");
        motor1 = hardwareMap.dcMotor.get("motor1");
        motor2 = hardwareMap.dcMotor.get("motor2");
        motor3 = hardwareMap.dcMotor.get("motor3");
    }

    @Override
    public void loop() {
        motor0.setPower(gamepad2.left_stick_x);
        motor1.setPower(gamepad2.left_stick_x);
        motor2.setPower(gamepad2.right_stick_x);
        motor3.setPower(gamepad2.right_stick_x);
    }
}