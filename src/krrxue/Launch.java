package krrxue;

import com.amazon.kindle.kindlet.KindletContext;
import ixtab.jailbreak.Jailbreak;
import ixtab.jailbreak.SuicidalKindlet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Launch extends SuicidalKindlet
{
    public void onCreate(final KindletContext context)
    {
        final JButton jButton = new JButton();
        jButton.setText("test");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    jButton.setText("h");
                    String serverAddress = "10.42.0.1";
                    Socket s = new Socket(serverAddress, 1234);
                    BufferedReader input =
                            new BufferedReader(new InputStreamReader(s.getInputStream()));
                    String answer = input.readLine();
                    jButton.setText(answer);
                    s.close();
                } catch (Exception e){

                }
            }
        });
        context.getRootContainer().add(jButton);
    }

    protected Jailbreak instantiateJailbreak() {
        return new KJailbreak();
    }
}