package main;

import com.google.zxing.WriterException;
import generator.QRCodeGenerator;
import model.Size;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainClass {

    public static void main(String[] args) throws IOException, WriterException {
        String content = "QRCode example with logo";
        byte[] qrArray = QRCodeGenerator.generateQRCodeWithLogo(content, new Size(450, 450));
        //byte[] qrArray = QRCodeGenerator.generateQRCode(content, new Size(450, 450));

        Path path = Paths.get("/Users/togrulr/Desktop/ExampleFiles/qr-image.png");
        Files.write(path, qrArray);
    }
}
