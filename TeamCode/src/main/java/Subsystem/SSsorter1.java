package Subsystem;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class SSsorter1 {

    public DcMotor sorterMotor1;
    public DcMotor sorterMotor2;

    public SSsorter1(HardwareMap hardwareMap) {


        sorterMotor1 = hardwareMap.dcMotor.get("sorter_motor_1");
        sorterMotor2 = hardwareMap.dcMotor.get("sorter_motor_2");

    }

    public void initSorter() {
    }

    public void startSorter() {
    }

    public void stopSorter() {
    }

    public void forwardSorter() {
        sorterMotor1.setPower(0.5);
    }
}



