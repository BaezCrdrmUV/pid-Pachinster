/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pid;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 *
 * @author Alex
 */
public class PID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        String jvmName = bean.getName();
        long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("PID  = " + pid);
 
 
    }
    
}
