/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program_data;

import javax.swing.*;
import java.sql.Time;
import java.util.*;
import java.util.concurrent.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.sound.sampled.*;


/**
 *
 * @author Cyber
 */
public class alarm_jadwal {
    private ScheduledExecutorService scheduler;
    private List<ReminderJadwal> reminder_jadwal;
    
    public alarm_jadwal() {
        scheduler = Executors.newScheduledThreadPool(1);
        reminder_jadwal = new ArrayList<>();
        start();
    }
    
    public void tambah_reminder(menu_jadwal.Schedule schedule, String hari) {
        ReminderJadwal task = new ReminderJadwal(schedule, hari);
        reminder_jadwal.add(task);
    }
    
    private void start() {
        scheduler.scheduleAtFixedRate(this::checkReminders, 0, 1, TimeUnit.MINUTES);
    }
    
    private void checkReminders() {
        Calendar now = Calendar.getInstance();
        for (ReminderJadwal task : reminder_jadwal) {
            task.check_dan_remind(now);
        }
    }
    
    public void stop() {
        scheduler.shutdown();
    }
    
    private void bunyikan_alarm() {
        try {
            String audioFilePath = "C:/Users/Cyber/Downloads/Semester 2/Kuliah/Pemrograman Berorientasi Obyek/Tugas Besar/Desktop-PBO/Sound/Alarm.wav";
            File audioFile = new File(audioFilePath);
            
            if (!audioFile.exists()) {
                System.err.println("File " + audioFilePath + " tidak ditemukan.");
                return;
            }
            
            AudioInputStream audio_input = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
//            File audioFile = new File("C:\Users\Cyber\Downloads\Semester 2\Kuliah\Pemrograman Berorientasi Obyek\Tugas Besar\Desktop-PBO\Sound\Alarm.wav");
//            File audioFile = new File("C:/Users/Cyber/Downloads/Semester 2/Kuliah/Pemrograman Berorientasi Obyek/Tugas Besar/Desktop-PBO/Sound/Alarm.wav");
//            AudioInputStream audio_input = AudioSystem.getAudioInputStream(audioFile);
//            Clip clip = AudioSystem.getClip();
//            javax.sound.sampled.AudioInputStream audio_input = javax.sound.sampled.AudioSystem.getAudioInputStream(new java.io.File("C:/Users/Cyber/Downloads/Semester 2/Kuliah/Pemrograman Berorientasi Obyek/Tugas Besar/Desktop-PBO/Sound/Alarm.wav").getAbsoluteFile());
//            javax.sound.sampled.Clip clip = javax.sound.sampled.AudioSystem.getClip();
            clip.open(audio_input);
            clip.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    class ReminderJadwal {
        private menu_jadwal.Schedule schedule;
        private String hari;
        
        public ReminderJadwal(menu_jadwal.Schedule schedule, String hari) {
            this.schedule = schedule;
            this.hari = hari;
        }
        
        public void check_dan_remind(Calendar now) {
            String hari_sekarang = new SimpleDateFormat("EEEE", new Locale("id", "ID")).format(now.getTime());
//            System.out.println("Hari sekarang: " + hari_sekarang);
            if (hari_sekarang.equalsIgnoreCase(hari)) {
                long waktu_sekarang_millis = now.getTimeInMillis();
                
                Calendar cal = Calendar.getInstance();
                cal.setTime(schedule.getWaktu());
                
                long waktu_jadwal_millis = cal.getTimeInMillis();
//                long waktu_jadwal_millis = schedule.getWaktu().getTime();
                
                if (waktu_jadwal_millis - waktu_sekarang_millis <= TimeUnit.MINUTES.toMillis(5) && waktu_jadwal_millis - waktu_sekarang_millis > 0) {
                    SwingUtilities.invokeLater(() -> {
                        JOptionPane.showMessageDialog(null, "Hai, 5 menit lagi untuk " + schedule.getKegiatan());
                        bunyikan_alarm();
                    });
                }
            }
        }
    }
}
