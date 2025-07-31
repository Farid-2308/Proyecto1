/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Carro.*;
import javax.swing.Timer;

public class FrmBateriaYReversa extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmBateriaYReversa.class.getName());
    private Encendido encenderCarro;
    private EstacionDeRadio radio = new EstacionDeRadio();
    private EstacionDeRadio modoRadio = new EstacionDeRadio();
    private AlarmaYBloqueo alarma = new AlarmaYBloqueo();
    private FrenoDeMano freno = new FrenoDeMano();
    private SensorDeReversa sensor = new SensorDeReversa();
    private SistemaBateria bateria = new SistemaBateria();
    private Timer timerBateria;
    private Timer timerCargaBateria;

    public FrmBateriaYReversa() {
        initComponents();
        encenderCarro = new Encendido() {
        };
        javax.swing.ButtonGroup grupoBotones = new javax.swing.ButtonGroup();
        grupoBotones.add(btnAM);
        grupoBotones.add(btnFm);
        grupoBotones.add(btnBluetooth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBluetooth = new javax.swing.JRadioButton();
        btnFm = new javax.swing.JRadioButton();
        btnAM = new javax.swing.JRadioButton();
        btnEncenderRadio = new javax.swing.JButton();
        btnApagarRadio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEncenderCarro = new javax.swing.JButton();
        btnApagarCarro = new javax.swing.JButton();
        lblModoSelec = new javax.swing.JLabel();
        progressBarNivelBateria = new javax.swing.JProgressBar();
        lblAlarma = new javax.swing.JLabel();
        btnAlarmaActivar = new javax.swing.JButton();
        btnAlarmaDesactiva = new javax.swing.JButton();
        lblEstadoAlarma = new javax.swing.JLabel();
        lblEstadoCarro = new javax.swing.JLabel();
        lblFrenoDeMano = new javax.swing.JLabel();
        btnActivarFreno = new javax.swing.JButton();
        btnFrenoDesactivar = new javax.swing.JButton();
        lblFreno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnReversa = new javax.swing.JButton();
        lblSensor = new javax.swing.JLabel();
        btnFrenarReversa = new javax.swing.JButton();
        lblEstadoBateria = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnDetenerCarga = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estacion de Radio");

        btnBluetooth.setText("Bluetooth");
        btnBluetooth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBluetoothActionPerformed(evt);
            }
        });

        btnFm.setText("FM");
        btnFm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFmActionPerformed(evt);
            }
        });

        btnAM.setText("AM");
        btnAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAMActionPerformed(evt);
            }
        });

        btnEncenderRadio.setText("Encender");
        btnEncenderRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderRadioActionPerformed(evt);
            }
        });

        btnApagarRadio.setText("Apagar");
        btnApagarRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarRadioActionPerformed(evt);
            }
        });

        jLabel2.setText("CARRO");

        btnEncenderCarro.setText("Encender");
        btnEncenderCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderCarroActionPerformed(evt);
            }
        });

        btnApagarCarro.setText("Apagar");
        btnApagarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCarroActionPerformed(evt);
            }
        });

        lblModoSelec.setText("Estado seleccionado: Ninguno");

        progressBarNivelBateria.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progressBarNivelBateriaStateChanged(evt);
            }
        });

        lblAlarma.setText("Alarma");

        btnAlarmaActivar.setText("Activar");
        btnAlarmaActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmaActivarActionPerformed(evt);
            }
        });

        btnAlarmaDesactiva.setText("Desactivar");
        btnAlarmaDesactiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmaDesactivaActionPerformed(evt);
            }
        });

        lblEstadoAlarma.setText("Alarma: Apagada");

        lblEstadoCarro.setText("Carro: Apagado");

        lblFrenoDeMano.setText("Freno de Mano");

        btnActivarFreno.setText("Activar");
        btnActivarFreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarFrenoActionPerformed(evt);
            }
        });

        btnFrenoDesactivar.setText("Desactivar");
        btnFrenoDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenoDesactivarActionPerformed(evt);
            }
        });

        lblFreno.setText("Freno de Mano: Desactivado");

        jLabel3.setText("Sensor de Reversa");

        btnReversa.setText("Reversa");
        btnReversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReversaActionPerformed(evt);
            }
        });

        lblSensor.setText("Sensor: Apagado");

        btnFrenarReversa.setText("Frenar");
        btnFrenarReversa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenarReversaActionPerformed(evt);
            }
        });

        lblEstadoBateria.setText("Estado de Bateria");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnDetenerCarga.setText("Detener");
        btnDetenerCarga.setActionCommand("Detener");
        btnDetenerCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerCargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModoSelec)
                            .addComponent(btnFm))
                        .addGap(0, 752, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBluetooth)
                                .addGap(266, 266, 266))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAM)
                                .addGap(299, 299, 299)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFrenoDeMano)
                            .addComponent(lblEstadoAlarma))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEstadoCarro)
                                .addGap(167, 167, 167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(186, 186, 186))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnEncenderRadio)
                        .addGap(18, 18, 18)
                        .addComponent(btnApagarRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(progressBarNivelBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnCargar)
                        .addGap(29, 29, 29)
                        .addComponent(btnDetenerCarga))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblEstadoBateria)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblAlarma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAlarmaActivar)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlarmaDesactiva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                                .addComponent(btnEncenderCarro)
                                .addGap(18, 18, 18)
                                .addComponent(btnApagarCarro)
                                .addGap(127, 127, 127))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActivarFreno)
                                .addGap(18, 18, 18)
                                .addComponent(btnFrenoDesactivar)
                                .addGap(117, 117, 117)
                                .addComponent(btnReversa)
                                .addGap(18, 18, 18)
                                .addComponent(btnFrenarReversa)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblFreno)
                                .addGap(163, 163, 163)
                                .addComponent(lblSensor)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEncenderRadio)
                                    .addComponent(btnApagarRadio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(lblAlarma))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEncenderCarro)
                                    .addComponent(btnApagarCarro)
                                    .addComponent(btnAlarmaActivar)
                                    .addComponent(btnAlarmaDesactiva))))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBluetooth)
                            .addComponent(lblEstadoAlarma)))
                    .addComponent(lblEstadoCarro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFrenoDeMano)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnActivarFreno)
                            .addComponent(btnFrenoDesactivar)
                            .addComponent(btnReversa)
                            .addComponent(btnFrenarReversa))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblModoSelec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btnDetenerCarga))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFreno)
                            .addComponent(lblSensor))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblEstadoBateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBarNivelBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAMActionPerformed
        if (radio.isEncendidos()) {
            modoRadio.cambiarEstacion(ModosRadio.AM);
            lblModoSelec.setText("Modo actual: AM");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnAMActionPerformed

    private void btnEncenderRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderRadioActionPerformed
        if (encenderCarro.isEncendido() && !alarma.isEstadoAlarmas()) {
            radio.encenderRadio();
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnEncenderRadioActionPerformed

    private void btnEncenderCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderCarroActionPerformed
        if (!encenderCarro.isEncendido() && !alarma.isEstadoAlarmas()) {
            encenderCarro.encender();
            lblEstadoCarro.setText("Carro: Encendido");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnEncenderCarroActionPerformed

    private void btnApagarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCarroActionPerformed
        if (encenderCarro.isEncendido()) {
            encenderCarro.apagar();
            lblEstadoCarro.setText("Carro: Apagado");
            lblSensor.setText("Sensor: Apagado");
            lblModoSelec.setText("Modo actual: Ninguno");
            timerBateria.stop();
        }
    }//GEN-LAST:event_btnApagarCarroActionPerformed

    private void btnBluetoothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBluetoothActionPerformed
        if (radio.isEncendidos()) {
            modoRadio.cambiarEstacion(ModosRadio.BLUETOOTH);
            lblModoSelec.setText("Modo actual: BLUETOOTH");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnBluetoothActionPerformed

    private void btnFmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFmActionPerformed
        if (radio.isEncendidos()) {
            modoRadio.cambiarEstacion(ModosRadio.FM);
            lblModoSelec.setText("Modo actual: FM");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnFmActionPerformed

    private void btnApagarRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarRadioActionPerformed
        if (radio.isEncendidos()) {
            radio.apagarRadio();
            lblModoSelec.setText("Modo actual: Ninguno");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnApagarRadioActionPerformed

    private void progressBarNivelBateriaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progressBarNivelBateriaStateChanged

    }//GEN-LAST:event_progressBarNivelBateriaStateChanged

    private void btnAlarmaActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmaActivarActionPerformed
        if (!alarma.isEstadoAlarmas()) {
            alarma.activarAlarma();
            radio.apagarRadio();
            lblEstadoAlarma.setText("Alarma: Encendida");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnAlarmaActivarActionPerformed

    private void btnAlarmaDesactivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmaDesactivaActionPerformed
        if (alarma.isEstadoAlarmas()) {
            alarma.desactivarAlarma();
            lblEstadoAlarma.setText("Alarma: Apagada");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnAlarmaDesactivaActionPerformed

    private void btnActivarFrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarFrenoActionPerformed
        if (!freno.isFrenoActivo() && encenderCarro.isEncendido()) {
            freno.activar();
            lblFreno.setText("Freno de Mano: Activo");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnActivarFrenoActionPerformed

    private void btnFrenoDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenoDesactivarActionPerformed
        if (freno.isFrenoActivo() && encenderCarro.isEncendido()) {
            freno.desactivar();
            lblFreno.setText("Freno de Mano: Desactivado");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnFrenoDesactivarActionPerformed

    private void btnReversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReversaActionPerformed
        if (encenderCarro.isEncendido() && !freno.isFrenoActivo()) {
            String mensaje = sensor.moverseReversa();
            lblSensor.setText(mensaje);
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnReversaActionPerformed


    private void btnFrenarReversaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenarReversaActionPerformed
        if (sensor.moverseReversa().contains("") && !freno.isFrenoActivo()) {
            lblSensor.setText("Ha Frenado");
            iniciarConsumoBateriaContinuo();
        }
    }//GEN-LAST:event_btnFrenarReversaActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        if (timerBateria != null && timerBateria.isRunning() || encenderCarro.isEncendido() || alarma.isEstadoAlarmas()) {
            timerBateria.stop();
        }
        iniciarCargaBateriaContinuo();
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnDetenerCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerCargaActionPerformed
        if (timerBateria != null && timerBateria.isRunning()) {
            timerBateria.stop();
        }

    }//GEN-LAST:event_btnDetenerCargaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmBateriaYReversa().setVisible(true));
    }

    private void actualizarEstadoBateria() {
        int nivel = (int) bateria.getNivelBateria();
        progressBarNivelBateria.setValue(nivel);
        lblEstadoBateria.setText(bateria.estadoBateria());
    }

    private void apague() {
        timerBateria.stop();
    }

    private void iniciarConsumoBateriaContinuo() {
        if (timerBateria == null || !timerBateria.isRunning()) {
            timerBateria = new javax.swing.Timer(1000, e -> {
                bateria.consumirBateria();
                actualizarEstadoBateria();

                if (bateria.getNivelBateria() <= 0) {
                    timerBateria.stop();
                    javax.swing.JOptionPane.showMessageDialog(this, "La bateria se ha agotado");
                }
            });
            timerBateria.start();
        }
    }

    private void iniciarCargaBateriaContinuo() {
        if (timerCargaBateria == null || !timerCargaBateria.isRunning()) {
            timerCargaBateria = new javax.swing.Timer(1000, e -> {
                bateria.cargarBateria();
                actualizarEstadoBateria();

                if (bateria.getNivelBateria() >= 100) {
                    bateria.cargarBateria();
                    actualizarEstadoBateria();
                    timerCargaBateria.stop();
                    javax.swing.JOptionPane.showMessageDialog(this, "Bateria completamente cargada");
                }
            });
            timerCargaBateria.start();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAM;
    private javax.swing.JButton btnActivarFreno;
    private javax.swing.JButton btnAlarmaActivar;
    private javax.swing.JButton btnAlarmaDesactiva;
    private javax.swing.JButton btnApagarCarro;
    private javax.swing.JButton btnApagarRadio;
    private javax.swing.JRadioButton btnBluetooth;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnDetenerCarga;
    private javax.swing.JButton btnEncenderCarro;
    private javax.swing.JButton btnEncenderRadio;
    private javax.swing.JRadioButton btnFm;
    private javax.swing.JButton btnFrenarReversa;
    private javax.swing.JButton btnFrenoDesactivar;
    private javax.swing.JButton btnReversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAlarma;
    private javax.swing.JLabel lblEstadoAlarma;
    private javax.swing.JLabel lblEstadoBateria;
    private javax.swing.JLabel lblEstadoCarro;
    private javax.swing.JLabel lblFreno;
    private javax.swing.JLabel lblFrenoDeMano;
    private javax.swing.JLabel lblModoSelec;
    private javax.swing.JLabel lblSensor;
    private javax.swing.JProgressBar progressBarNivelBateria;
    // End of variables declaration//GEN-END:variables
}
