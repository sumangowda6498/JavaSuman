package UdemyRahul.TestNg;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
@Override
    public void onTestSuccess(ITestResult result){
    System.out.println("Success");

}
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Failure------------------------------------------------------");
    }
    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("SKIPPED");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }

    @Override
    public void onTestStart(ITestResult result){

    }


}
