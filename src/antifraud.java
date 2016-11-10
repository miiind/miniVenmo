import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// example of program that detects suspicious transactions
// fraud detection algorithm
public class  antifraud{
	
	public static void main(String[] args) {
		String initpath = "./paymo_input/batch_payment.txt";
		String streampath = "./paymo_input/stream_payment.txt";
		String outputpath1 = "./paymo_output/output1.txt";
        String outputpath2 = "./paymo_output/output2.txt";
        String outputpath3 = "./paymo_output/output3.txt";
		UserPool userPool1 = new UserPool(initpath);
        UserPool userPool2 = new UserPool(userPool1);
        UserPool userPool3 = new UserPool(userPool1);
		userPool1.writeFile(streampath, outputpath1, 1);
        userPool2.writeFile(streampath, outputpath2, 2);
        userPool3.writeFile(streampath, outputpath3, 4);
	}
}