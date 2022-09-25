/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.sebss.Interfaz;

import com.sebss.Ayudas.*;
import com.sebss.Exceptions.*;
import com.sebss.Jugadores.Jugador;
import com.sebss.Partidas.*;
import java.awt.Color;
import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class PanellJugarPartida extends javax.swing.JDialog {

    /**
     * Creates new form PanellJugarPartida
     */
    private Partida partida;
    private Component[] componentesJ1;
    private Component[] componentesJ2;
    private int posicionLetraActualJ1;
    private int posicionLetraActualJ2;
    private boolean finalizadoJ1;
    private boolean finalizadoJ2;
    public static final int PUNTOS_GANADOR = 10;
    public static final int PUNTOS_ACERTAR_TODO = 100;
    public static final int PUNTOS_EMPATE = 5;

    public PanellJugarPartida(JDialog parent, boolean modal, Partida partida) throws EPartidaNoValidaException {
        super(parent, modal);
        initComponents();
        // Se inicia en el centro de la pantalla
        this.setLocationRelativeTo(null);
        if (partida == null) {
            throw new EPartidaNoValidaException("No se puede jugar sin partida");
        }
        this.partida = partida;
        this.componentesJ1 = panelJ1.getComponents();
        this.componentesJ2 = panelJ2.getComponents();
        this.finalizadoJ1 = false;
        this.finalizadoJ2 = false;
        //Ponemos los nombres de los jugadores en sus respectivos lugares
        nombreJugador1.setText(partida.getJugador1().getNombre());
        nombreJugador2.setText(partida.getJugador2().getNombre());
        //Iniciamos al valor correcto los contadores
        palabrasAcertadasJ1.setText("0");
        palabrasAcertadasJ2.setText("0");
        palabrasFalladasJ1.setText("0");
        palabrasFalladasJ2.setText("0");
        vueltaActualJ1.setText("1");
        vueltaActualJ2.setText("1");
        vueltasMaxJ1.setText(String.valueOf(Rosco.NUM_VUELTAS_MAX));
        vueltasMaxJ2.setText(String.valueOf(Rosco.NUM_VUELTAS_MAX));
        resultadoJ1.setText("Comienza jugando");
        resultadoJ2.setText("Debera esperar su turno");
        //El panel para mostrar las letras se inicializa con todas las letras que tendra el rosco sin color
        //Excepto la primera letra, para asi indicar que estamos en esa letra
        JLabel nuevaEtiqueta = new JLabel(String.valueOf(Rosco.ABECEDARIO[0]));
        nuevaEtiqueta.setForeground(Color.BLUE);
        letrasJ1.add(nuevaEtiqueta);
        for (int i = 1; i < partida.getNumPalabras(); i++) {
            letrasJ1.add(new JLabel(String.valueOf(Rosco.ABECEDARIO[i])));
        }
        nuevaEtiqueta = new JLabel(String.valueOf(Rosco.ABECEDARIO[0]));
        nuevaEtiqueta.setForeground(Color.BLUE);
        letrasJ2.add(nuevaEtiqueta);
        for (int i = 1; i < partida.getNumPalabras(); i++) {
            letrasJ2.add(new JLabel(String.valueOf(Rosco.ABECEDARIO[i])));
        }
        //Ponemos la definicion de la primera palabra
        definicionJ1.setText("Empieza por A:\n" + partida.getRosco1().getPalabras()[0].getDef1().toString());
        definicionJ2.setText("Empieza por A:\n" + partida.getRosco2().getPalabras()[0].getDef2().toString());
        //Bloqueamos el jugador 2, ya que empieza a jugar el jugador 1
        for (Component c : componentesJ2) {
            c.setEnabled(false);
        }
    }

    private PanellJugarPartida(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void initComponents() {

        panelJ1 = new javax.swing.JPanel();
        letrasJ1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        palabrasAcertadasJ1 = new javax.swing.JLabel();
        palabrasFalladasJ1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        vueltaActualJ1 = new javax.swing.JLabel();
        vueltasMaxJ1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        definicionJ1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        respuestaJ1 = new javax.swing.JTextField();
        enviarPalabraJ1 = new javax.swing.JButton();
        recibirAyudaJ1 = new javax.swing.JButton();
        pasarPalabraJ1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        resultadoJ1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nombreJugador1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelJ2 = new javax.swing.JPanel();
        letrasJ2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        palabrasAcertadasJ2 = new javax.swing.JLabel();
        palabrasFalladasJ2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        vueltaActualJ2 = new javax.swing.JLabel();
        vueltasMaxJ2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        definicionJ2 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        respuestaJ2 = new javax.swing.JTextField();
        enviarPalabraJ2 = new javax.swing.JButton();
        recibirAyudaJ2 = new javax.swing.JButton();
        pasarPalabraJ2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        resultadoJ2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        nombreJugador2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ayuda = new javax.swing.JMenuItem();
        forzarSalida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pasapalabra - Partida Normal");
        setBackground(java.awt.Color.white);
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 660));

        panelJ1.setBackground(new java.awt.Color(244, 241, 234));
        panelJ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        letrasJ1.setBackground(java.awt.Color.white);
        letrasJ1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        letrasJ1.setForeground(new java.awt.Color(83, 119, 143));
        letrasJ1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(83, 119, 143));
        jLabel1.setText("Palabras acertadas:");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 119, 143));
        jLabel2.setText("Palabras falladas:");

        palabrasAcertadasJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        palabrasAcertadasJ1.setForeground(new java.awt.Color(83, 119, 143));
        palabrasAcertadasJ1.setText("0");

        palabrasFalladasJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        palabrasFalladasJ1.setForeground(new java.awt.Color(83, 119, 143));
        palabrasFalladasJ1.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(83, 119, 143));
        jLabel8.setText("Vuelta actual:");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(83, 119, 143));
        jLabel9.setText("Maximo vueltas:");

        vueltaActualJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        vueltaActualJ1.setForeground(new java.awt.Color(83, 119, 143));
        vueltaActualJ1.setText("1");

        vueltasMaxJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        vueltasMaxJ1.setForeground(new java.awt.Color(83, 119, 143));
        vueltasMaxJ1.setText("2");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(83, 119, 143));
        jLabel5.setText("Siguiente Palabra...");

        definicionJ1.setEditable(false);
        definicionJ1.setColumns(20);
        definicionJ1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        definicionJ1.setForeground(new java.awt.Color(83, 119, 143));
        definicionJ1.setRows(5);
        jScrollPane1.setViewportView(definicionJ1);

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(83, 119, 143));
        jLabel6.setText("Escriba su respuesta aqui:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        respuestaJ1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        respuestaJ1.setForeground(new java.awt.Color(83, 119, 143));
        respuestaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaJ1ActionPerformed(evt);
            }
        });

        enviarPalabraJ1.setBackground(new java.awt.Color(83, 119, 143));
        enviarPalabraJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        enviarPalabraJ1.setForeground(java.awt.Color.white);
        enviarPalabraJ1.setText("Enviar respuesta");
        enviarPalabraJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarPalabraJ1ActionPerformed(evt);
            }
        });

        recibirAyudaJ1.setBackground(new java.awt.Color(83, 119, 143));
        recibirAyudaJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        recibirAyudaJ1.setForeground(java.awt.Color.white);
        recibirAyudaJ1.setText("Recibir ayuda");
        recibirAyudaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibirAyudaJ1ActionPerformed(evt);
            }
        });

        pasarPalabraJ1.setBackground(new java.awt.Color(83, 119, 143));
        pasarPalabraJ1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        pasarPalabraJ1.setForeground(java.awt.Color.white);
        pasarPalabraJ1.setText("Pasa palabra");
        pasarPalabraJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarPalabraJ1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(83, 119, 143));
        jLabel3.setText("Resultado de la ultima jugada:");

        resultadoJ1.setEditable(false);
        resultadoJ1.setBackground(java.awt.Color.white);
        resultadoJ1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        resultadoJ1.setForeground(new java.awt.Color(83, 119, 143));
        resultadoJ1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultadoJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoJ1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(83, 119, 143));
        jLabel15.setText("Jugador 1");

        nombreJugador1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        nombreJugador1.setForeground(new java.awt.Color(83, 119, 143));

        javax.swing.GroupLayout panelJ1Layout = new javax.swing.GroupLayout(panelJ1);
        panelJ1.setLayout(panelJ1Layout);
        panelJ1Layout.setHorizontalGroup(
            panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ1Layout.createSequentialGroup()
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelJ1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(palabrasFalladasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelJ1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(palabrasAcertadasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vueltasMaxJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(vueltaActualJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(nombreJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recibirAyudaJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelJ1Layout.createSequentialGroup()
                                .addComponent(enviarPalabraJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pasarPalabraJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176))
                            .addGroup(panelJ1Layout.createSequentialGroup()
                                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(resultadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(respuestaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
            .addGroup(panelJ1Layout.createSequentialGroup()
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel6))
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(letrasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelJ1Layout.setVerticalGroup(
            panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ1Layout.createSequentialGroup()
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15)
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombreJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letrasJ1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(palabrasAcertadasJ1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(palabrasFalladasJ1)))
                    .addGroup(panelJ1Layout.createSequentialGroup()
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(vueltaActualJ1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(vueltasMaxJ1))))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuestaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelJ1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviarPalabraJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasarPalabraJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recibirAyudaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(517, 410));

        panelJ2.setBackground(new java.awt.Color(248, 216, 216));
        panelJ2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        letrasJ2.setBackground(java.awt.Color.white);
        letrasJ2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        letrasJ2.setForeground(new java.awt.Color(83, 119, 143));
        letrasJ2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(83, 119, 143));
        jLabel4.setText("Palabras acertadas:");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(83, 119, 143));
        jLabel7.setText("Palabras falladas:");

        palabrasAcertadasJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        palabrasAcertadasJ2.setForeground(new java.awt.Color(83, 119, 143));
        palabrasAcertadasJ2.setText("0");

        palabrasFalladasJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        palabrasFalladasJ2.setForeground(new java.awt.Color(83, 119, 143));
        palabrasFalladasJ2.setText("0");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(83, 119, 143));
        jLabel10.setText("Vuelta actual:");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(83, 119, 143));
        jLabel11.setText("Maximo vueltas:");

        vueltaActualJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        vueltaActualJ2.setForeground(new java.awt.Color(83, 119, 143));
        vueltaActualJ2.setText("1");

        vueltasMaxJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        vueltasMaxJ2.setForeground(new java.awt.Color(83, 119, 143));
        vueltasMaxJ2.setText("2");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(83, 119, 143));
        jLabel12.setText("Siguiente Palabra...");

        definicionJ2.setEditable(false);
        definicionJ2.setColumns(20);
        definicionJ2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        definicionJ2.setForeground(new java.awt.Color(83, 119, 143));
        definicionJ2.setRows(5);
        jScrollPane2.setViewportView(definicionJ2);

        jLabel13.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(83, 119, 143));
        jLabel13.setText("Escriba su respuesta aqui:");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        respuestaJ2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        respuestaJ2.setForeground(new java.awt.Color(83, 119, 143));
        respuestaJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuestaJ2ActionPerformed(evt);
            }
        });

        enviarPalabraJ2.setBackground(new java.awt.Color(244, 241, 234));
        enviarPalabraJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        enviarPalabraJ2.setForeground(new java.awt.Color(83, 119, 143));
        enviarPalabraJ2.setText("Enviar respuesta");
        enviarPalabraJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarPalabraJ2ActionPerformed(evt);
            }
        });

        recibirAyudaJ2.setBackground(new java.awt.Color(244, 241, 234));
        recibirAyudaJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        recibirAyudaJ2.setForeground(new java.awt.Color(83, 119, 143));
        recibirAyudaJ2.setText("Recibir ayuda");
        recibirAyudaJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibirAyudaJ2ActionPerformed(evt);
            }
        });

        pasarPalabraJ2.setBackground(new java.awt.Color(244, 241, 234));
        pasarPalabraJ2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        pasarPalabraJ2.setForeground(new java.awt.Color(83, 119, 143));
        pasarPalabraJ2.setText("Pasa palabra");
        pasarPalabraJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasarPalabraJ2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(83, 119, 143));
        jLabel14.setText("Resultado de la ultima jugada:");

        resultadoJ2.setEditable(false);
        resultadoJ2.setBackground(java.awt.Color.white);
        resultadoJ2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        resultadoJ2.setForeground(new java.awt.Color(83, 119, 143));
        resultadoJ2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultadoJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoJ2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(83, 119, 143));
        jLabel16.setText("Jugador 2");

        nombreJugador2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        nombreJugador2.setForeground(new java.awt.Color(83, 119, 143));

        javax.swing.GroupLayout panelJ2Layout = new javax.swing.GroupLayout(panelJ2);
        panelJ2.setLayout(panelJ2Layout);
        panelJ2Layout.setHorizontalGroup(
            panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJ2Layout.createSequentialGroup()
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(palabrasAcertadasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(palabrasFalladasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(158, 164, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(57, 57, 57))
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(nombreJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(157, 157, 157))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)))))
                .addContainerGap())
            .addGroup(panelJ2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recibirAyudaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addComponent(enviarPalabraJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pasarPalabraJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resultadoJ2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                            .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(letrasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelJ2Layout.createSequentialGroup()
                                    .addGap(341, 341, 341)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vueltaActualJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18))
                        .addGroup(panelJ2Layout.createSequentialGroup()
                            .addGap(483, 483, 483)
                            .addComponent(vueltasMaxJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(164, 164, 164)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(respuestaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        panelJ2Layout.setVerticalGroup(
            panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJ2Layout.createSequentialGroup()
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombreJugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(letrasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(palabrasAcertadasJ2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(palabrasFalladasJ2)))
                    .addGroup(panelJ2Layout.createSequentialGroup()
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(vueltaActualJ2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(vueltasMaxJ2))))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuestaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelJ2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviarPalabraJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pasarPalabraJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recibirAyudaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(244, 241, 234));
        jMenuBar1.setForeground(new java.awt.Color(83, 119, 143));
        jMenuBar1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jMenu1.setText("Opciones");

        ayuda.setText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        jMenu1.add(ayuda);

        forzarSalida.setText("Forzar salida");
        forzarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forzarSalidaActionPerformed(evt);
            }
        });
        jMenu1.add(forzarSalida);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void respuestaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaJ1ActionPerformed

    private void enviarPalabraJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarPalabraJ1ActionPerformed
        // Al pulsar el boton de enviar respuesta, comprobamos la respuesta y actuamos en consecuencia
        try {
            boolean pierdeTurno = false;
            if (respuestaJ1.getText() == null || respuestaJ1.getText().equals("")) {
                throw new EPalabraNoValidaException("La palabra respuesta no puede ser nula o vacia, vuelva a intentarlo");
            }
            //Si si hay una respuesta, comprobamos si es la correcta o no
            if (partida.getRosco1().getPalabras()[posicionLetraActualJ1].getPalabra().toString().equalsIgnoreCase(respuestaJ1.getText())) {
                //Si acertamos la marcamos como correcta en la barra de letras y en el rosco
                partida.getRosco1().getPalabras()[posicionLetraActualJ1].setAcertada(true);
                letrasJ1.getComponent(posicionLetraActualJ1).setForeground(Color.GREEN);
                //Sumamos un acierto
                if (partida.getRosco1().setNumAciertos(partida.getRosco1().getNumAciertos() + 1)) {
                    palabrasAcertadasJ1.setText(String.valueOf(partida.getRosco1().getNumAciertos()));
                } else {
                    throw new ERoscoNoValidoException("No puede haber un valor negativo en los aciertos");
                }
                //Emitimos mensaje de acertada en el resultado
                resultadoJ1.setText("La palabra ha sido acertada");
                resultadoJ1.setForeground(Color.GREEN);
            } else {
                //Si no acertamos la marcamos como fallada en la barra de letras y en el rosco y pasamos el turno al otro jugador
                partida.getRosco1().getPalabras()[posicionLetraActualJ1].setFallada(true);
                letrasJ1.getComponent(posicionLetraActualJ1).setForeground(Color.RED);
                //Sumamos un fallo
                if (partida.getRosco1().setNumFallos(partida.getRosco1().getNumFallos() + 1)) {
                    palabrasFalladasJ1.setText(String.valueOf(partida.getRosco1().getNumFallos()));
                } else {
                    throw new ERoscoNoValidoException("No puede haber un valor negativo en los aciertos,lo sentimos, se debe abortar la partida");
                }
                //Emitimos mensaje de acertada en el resultado
                resultadoJ1.setText("La ha sido fallada");
                resultadoJ1.setForeground(Color.RED);
                //Le pasamos el turno al otro jugador, siempre y cuando no estemos en la vuelta 2
                if (partida.getRosco1().getVuelta() < 2) {
                    pierdeTurno = true;
                }
            }
            //En caso de que estuviera aplazada cambiamos el aplazada por false
            partida.getRosco1().getPalabras()[posicionLetraActualJ1].setAplazada(false);
            //Comprobamos si hemos acertado todas las palabras y por tanto, ganado
            if (partida.getRosco1().getNumAciertos() == partida.getNumPalabras()) {
                finalizarPartida(partida.getJugador1());
            }
            //Una vez comprobado saltamos a la siguiente palabra no contestada si no hemos respondido todas
            if (partida.getRosco1().getNumAciertos() + partida.getRosco1().getNumFallos() == partida.getNumPalabras()) {
                posicionLetraActualJ1 = -1;
            } else {
                posicionLetraActualJ1 = calcularPosicionPalabraSiguiente(partida.getRosco1());
            }
            //Si la posicion actual es -1 significa que ya hemos completados las maximas vueltas
            //o hemos contestado a todas las palabras y debemos acabar
            //Por tanto, este jugador ya no podra jugar mas
            if (posicionLetraActualJ1 == -1) {
                finalizadoJ1 = true;
                pierdeTurno = true;
            } else {
                //Si no toca finalizar, actualizamos la definicion de la palabra actual
                definicionJ1.setText("Empieza por " + partida.getRosco1().getPalabras()[posicionLetraActualJ1].getInicial() + ":\n" + partida.getRosco1().getPalabras()[posicionLetraActualJ1].getDef1().toString());
                //Tambien borramos la ultima respuesta del textfield de resouesta
                respuestaJ1.setText("");
                //Tambien indicamos la letra actual
                letrasJ1.getComponent(posicionLetraActualJ1).setForeground(Color.BLUE);
            }
            //Si perdemos el turno, le pasamos el turno al jugador 2
            if (pierdeTurno) {
                cambiarTurno(partida.getJugador2());
            }
        } catch (EPalabraNoValidaException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);
        } catch (ERoscoNoValidoException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (EJugadorNoValidoException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_enviarPalabraJ1ActionPerformed

    private void recibirAyudaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibirAyudaJ1ActionPerformed
        // Cuando recibimos una ayuda tenemos varias opciones segun la ayuda recibida
        // Primero mostramos y damos a elegir el tipo de ayuda deseada
        String retorno = (String) JOptionPane.showInputDialog(this, "Por favor seleccione el tipo de ayuda deseado", "Seleccion de ayuda", JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Comprar (20 puntos)", "Pista (5 puntos)"}, "Pista (5 puntos)");
        //Comprobamos que ayuda se ha seleccionado y si tenemos puntos necesario para ello
        try {
            Ayuda ayudaRecibida;
            if (retorno.equals("Comprar (20 puntos)")) {
                //La compra implica la muestra de toda la informacion de la palabra
                if (partida.getJugador1().getPuntos() < Compra.PRECIO_ESTANDAR) {
                    throw new EAyudaNoValidaException("No tiene suficientes puntos para comprar esta palabra");
                }
                ayudaRecibida = new Compra(Compra.PRECIO_ESTANDAR, partida.getRosco1().getPalabras()[posicionLetraActualJ1]);
                partida.getRosco1().getPalabras()[posicionLetraActualJ1].setAcertada(true);
                respuestaJ1.setText(partida.getRosco1().getPalabras()[posicionLetraActualJ1].getPalabra().toString());
                this.enviarPalabraJ1ActionPerformed(evt);
            } else {
                if (partida.getJugador1().getPuntos() < Pista.PRECIO_ESTANDAR) {
                    throw new EAyudaNoValidaException("No tiene suficientes puntos para comprar esta palabra");
                }
                //Si hay 2 definiciones mostramos la segunda, sino parte de las letras de la palabra
                if (partida.getRosco1().getPalabras()[posicionLetraActualJ1].getDef2() != null && !partida.getRosco1().getPalabras()[posicionLetraActualJ1].getDef2().toString().equals("")) {
                    ayudaRecibida = new SegundaDefinicion(Pista.PRECIO_ESTANDAR, partida.getRosco1().getPalabras()[posicionLetraActualJ1]);
                } else {
                    ayudaRecibida = new Letras(Pista.PRECIO_ESTANDAR, partida.getRosco1().getPalabras()[posicionLetraActualJ1]);
                }
            }
            //Mostramos la informacion de la ayuda
            JOptionPane.showMessageDialog(this, "La informacion de la palabra es:\n" + ayudaRecibida.mostrar_info(), "Compra", JOptionPane.INFORMATION_MESSAGE);
        } catch (EAyudaNoValidaException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Aviso en la ayuda", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_recibirAyudaJ1ActionPerformed

    private void pasarPalabraJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarPalabraJ1ActionPerformed
        // Si pasamos palabra antes de la vuelta 2 simplemente aplazamos la palabra y pasamos el turno al otro jugador
        // Si pasamos palabra tras la vuelta 2 fallamos la palabra actual y seguimos
        boolean pierdeTurno = false;
        if (partida.getRosco1().getVuelta() >= 2) {
            try {
                //Si pasamos palabra ahora, acumulamos un fallo
                partida.getRosco1().getPalabras()[posicionLetraActualJ1].setFallada(true);
                letrasJ1.getComponent(posicionLetraActualJ1).setForeground(Color.RED);
                //Si estaba aplazada, le quitamos el aplazado
                partida.getRosco1().getPalabras()[posicionLetraActualJ1].setAplazada(false);
                //Sumamos un fallo
                if (partida.getRosco1().setNumFallos(partida.getRosco1().getNumFallos() + 1)) {
                    palabrasFalladasJ1.setText(String.valueOf(partida.getRosco1().getNumFallos()));
                } else {
                    throw new ERoscoNoValidoException("No puede haber un valor negativo en los aciertos,lo sentimos, se debe abortar el entrenamiento");
                }
            } catch (ERoscoNoValidoException e) {
                JOptionPane.showMessageDialog(this, e.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } else {
            //Sino, aplazamos la palabra
            partida.getRosco1().getPalabras()[posicionLetraActualJ1].setAplazada(true);
            letrasJ1.getComponent(posicionLetraActualJ1).setForeground(Color.BLACK);
            //Pierde el turno
            pierdeTurno = true;
        }
        //En cualquier caso, indicamos que se ha pasado palabra y actualizamos la letra actual
        resultadoJ1.setText("Se ha pasado palabra");
        resultadoJ1.setForeground(Color.BLACK);
        //Calculamos la siguiente posicion si es necesario
        if (partida.getRosco1().getNumAciertos() + partida.getRosco1().getNumFallos() == partida.getRosco1().getNumLetras()) {
            posicionLetraActualJ1 = -1;
        } else {
            posicionLetraActualJ1 = calcularPosicionPalabraSiguiente(partida.getRosco1());
        }
        //Si la posicion actual es -1 significa que ya hemos completados las maximas vueltas y debemos acabar
        if (posicionLetraActualJ1 == -1) {
            finalizadoJ1 = true;
            pierdeTurno = true;
        } else {
            //Si no toca finalizar, actualizamos la definicion de la palabra actual
            definicionJ1.setText("Empieza por " + partida.getRosco1().getPalabras()[posicionLetraActualJ1].getInicial() + ":\n" + partida.getRosco1().getPalabras()[posicionLetraActualJ1].getDef1().toString());
            //Tambien borramos la ultima respuesta del textfield de resouesta
            respuestaJ1.setText("");
            //Tambien indicamos la letra actual
            letrasJ1.getComponent(posicionLetraActualJ1).setForeground(Color.BLUE);
        }
        //Si perdemos el turno, le pasamos el turno al jugador 2
        if (pierdeTurno) try {
            cambiarTurno(partida.getJugador2());
        } catch (EJugadorNoValidoException ex) {
            Logger.getLogger(PanellJugarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasarPalabraJ1ActionPerformed

    private void resultadoJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoJ1ActionPerformed

    private void respuestaJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respuestaJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_respuestaJ2ActionPerformed

    private void enviarPalabraJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarPalabraJ2ActionPerformed
        // Simetrico al enviar respuesta de J1
        // Al pulsar el boton de enviar respuesta, comprobamos la respuesta y actuamos en consecuencia
        try {
            boolean pierdeTurno = false;
            if (respuestaJ2.getText() == null || respuestaJ2.getText().equals("")) {
                throw new EPalabraNoValidaException("La palabra respuesta no puede ser nula o vacia, vuelva a intentarlo");
            }
            //Si si hay una respuesta, comprobamos si es la correcta o no
            if (partida.getRosco2().getPalabras()[posicionLetraActualJ2].getPalabra().toString().equalsIgnoreCase(respuestaJ2.getText())) {
                //Si acertamos la marcamos como correcta en la barra de letras y en el rosco
                partida.getRosco2().getPalabras()[posicionLetraActualJ2].setAcertada(true);
                letrasJ2.getComponent(posicionLetraActualJ2).setForeground(Color.GREEN);
                //Sumamos un acierto
                if (partida.getRosco2().setNumAciertos(partida.getRosco2().getNumAciertos() + 1)) {
                    palabrasAcertadasJ2.setText(String.valueOf(partida.getRosco2().getNumAciertos()));
                } else {
                    throw new ERoscoNoValidoException("No puede haber un valor negativo en los aciertos");
                }
                //Emitimos mensaje de acertada en el resultado
                resultadoJ2.setText("La palabra ha sido acertada");
                resultadoJ2.setForeground(Color.GREEN);
            } else {
                //Si no acertamos la marcamos como fallada en la barra de letras y en el rosco y pasamos el turno al otro jugador
                partida.getRosco2().getPalabras()[posicionLetraActualJ2].setFallada(true);
                letrasJ2.getComponent(posicionLetraActualJ2).setForeground(Color.RED);
                //Sumamos un fallo
                if (partida.getRosco2().setNumFallos(partida.getRosco2().getNumFallos() + 1)) {
                    palabrasFalladasJ2.setText(String.valueOf(partida.getRosco2().getNumFallos()));
                } else {
                    throw new ERoscoNoValidoException("No puede haber un valor negativo en los aciertos,lo sentimos, se debe abortar la partida");
                }
                //Emitimos mensaje de acertada en el resultado
                resultadoJ2.setText("La ha sido fallada");
                resultadoJ2.setForeground(Color.RED);
                //Le pasamos el turno al otro jugador, siempre y cuando no estemos en la vuelta 2
                if (partida.getRosco2().getVuelta() < 2) {
                    pierdeTurno = true;
                }
            }
            //En caso de que estuviera aplazada cambiamos el aplazada por false
            partida.getRosco2().getPalabras()[posicionLetraActualJ2].setAplazada(false);
            //Comprobamos si hemos acertado todas las palabras y por tanto, ganado
            if (partida.getRosco2().getNumAciertos() == partida.getNumPalabras()) {
                finalizarPartida(partida.getJugador2());
            }
            //Una vez comprobado saltamos a la siguiente palabra no contestada si no hemos respondido todas
            if (partida.getRosco2().getNumAciertos() + partida.getRosco2().getNumFallos() == partida.getNumPalabras()) {
                posicionLetraActualJ2 = -1;
            } else {
                posicionLetraActualJ2 = calcularPosicionPalabraSiguiente(partida.getRosco2());
            }
            //Si la posicion actual es -1 significa que ya hemos completados las maximas vueltas
            //o hemos contestado a todas las palabras y debemos acabar
            //Por tanto, este jugador ya no podra jugar mas
            if (posicionLetraActualJ2 == -1) {
                finalizadoJ2 = true;
                pierdeTurno = true;
            } else {
                //Si no toca finalizar, actualizamos la definicion de la palabra actual
                definicionJ2.setText("Empieza por " + partida.getRosco2().getPalabras()[posicionLetraActualJ2].getInicial() + ":\n" + partida.getRosco2().getPalabras()[posicionLetraActualJ2].getDef1().toString());
                //Tambien borramos la ultima respuesta del textfield de resouesta
                respuestaJ2.setText("");
                //Tambien indicamos la letra actual
                letrasJ2.getComponent(posicionLetraActualJ2).setForeground(Color.BLUE);
            }
            //Si perdemos el turno, le pasamos el turno al jugador 2
            if (pierdeTurno) {
                cambiarTurno(partida.getJugador1());
            }
        } catch (EPalabraNoValidaException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);
        } catch (ERoscoNoValidoException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (EJugadorNoValidoException ex) {
            JOptionPane.showMessageDialog(this, ex.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_enviarPalabraJ2ActionPerformed

    private void recibirAyudaJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibirAyudaJ2ActionPerformed
        // Simetrico al recibir ayuda del J1
        // Cuando recibimos una ayuda tenemos varias opciones segun la ayuda recibida
        // Primero mostramos y damos a elegir el tipo de ayuda deseada
        Object retorno = JOptionPane.showInputDialog(this, "Por favor seleccione el tipo de ayuda deseado", "Sleccion de ayuda", JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Comprar (20 puntos)", "Pista (5 puntos)"}, "Pista (5 puntos)");
        //Comprobamos que ayuda se ha seleccionado y si tenemos puntos necesario para ello
        try {
            Ayuda ayudaRecibida;
            if (retorno.equals("Comprar (20 puntos)")) {
                //La compra implica la muestra de toda la informacion de la palabra
                if (partida.getJugador2().getPuntos() < Compra.PRECIO_ESTANDAR) {
                    throw new EAyudaNoValidaException("No tiene suficientes puntos para comprar esta palabra");
                }
                ayudaRecibida = new Compra(Compra.PRECIO_ESTANDAR, partida.getRosco2().getPalabras()[posicionLetraActualJ2]);
                partida.getRosco2().getPalabras()[posicionLetraActualJ2].setAcertada(true);
                respuestaJ2.setText(partida.getRosco2().getPalabras()[posicionLetraActualJ2].getPalabra().toString());
                this.enviarPalabraJ2ActionPerformed(evt);
            } else {
                if (partida.getJugador2().getPuntos() < Pista.PRECIO_ESTANDAR) {
                    throw new EAyudaNoValidaException("No tiene suficientes puntos para comprar esta palabra");
                }
                //Si hay 2 definiciones mostramos la segunda, sino parte de las letras de la palabra
                if (partida.getRosco2().getPalabras()[posicionLetraActualJ2].getDef2() != null && !partida.getRosco2().getPalabras()[posicionLetraActualJ2].getDef2().toString().equals("")) {
                    ayudaRecibida = new SegundaDefinicion(Pista.PRECIO_ESTANDAR, partida.getRosco2().getPalabras()[posicionLetraActualJ2]);
                } else {
                    ayudaRecibida = new Letras(Pista.PRECIO_ESTANDAR, partida.getRosco2().getPalabras()[posicionLetraActualJ2]);
                }
            }
            //Mostramos la informacion de la ayuda
            JOptionPane.showMessageDialog(this, "La informacion de la palabra es:\n" + ayudaRecibida.mostrar_info(), "Compra", JOptionPane.INFORMATION_MESSAGE);
        } catch (EAyudaNoValidaException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Aviso en la ayuda", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_recibirAyudaJ2ActionPerformed

    private void pasarPalabraJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasarPalabraJ2ActionPerformed
        // Simetrico al pasar palabra de J1
        // Si pasamos palabra antes de la vuelta 2 simplemente aplazamos la palabra y pasamos el turno al otro jugador
        // Si pasamos palabra tras la vuelta 2 fallamos la palabra actual y seguimos
        boolean pierdeTurno = false;
        if (partida.getRosco2().getVuelta() >= 2) {
            try {
                //Si pasamos palabra ahora, acumulamos un fallo
                partida.getRosco2().getPalabras()[posicionLetraActualJ2].setFallada(true);
                letrasJ2.getComponent(posicionLetraActualJ2).setForeground(Color.RED);
                //Si estaba aplazada, le quitamos el aplazado
                partida.getRosco2().getPalabras()[posicionLetraActualJ2].setAplazada(false);
                //Sumamos un fallo
                if (partida.getRosco2().setNumFallos(partida.getRosco2().getNumFallos() + 1)) {
                    palabrasFalladasJ2.setText(String.valueOf(partida.getRosco2().getNumFallos()));
                } else {
                    throw new ERoscoNoValidoException("No puede haber un valor negativo en los aciertos,lo sentimos, se debe abortar el entrenamiento");
                }
            } catch (ERoscoNoValidoException e) {
                JOptionPane.showMessageDialog(this, e.toString(), "Error al responder", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } else {
            //Sino, aplazamos la palabra
            partida.getRosco2().getPalabras()[posicionLetraActualJ2].setAplazada(true);
            letrasJ2.getComponent(posicionLetraActualJ2).setForeground(Color.BLACK);
            //Pierde el turno
            pierdeTurno = true;
        }
        //En cualquier caso, indicamos que se ha pasado palabra y actualizamos la letra actual
        resultadoJ2.setText("Se ha pasado palabra");
        resultadoJ2.setForeground(Color.BLACK);
        //Calculamos la siguiente posicion si es necesario
        if (partida.getRosco2().getNumAciertos() + partida.getRosco2().getNumFallos() == partida.getRosco2().getNumLetras()) {
            posicionLetraActualJ2 = -1;
        } else {
            posicionLetraActualJ2 = calcularPosicionPalabraSiguiente(partida.getRosco2());
        }
        //Si la posicion actual es -1 significa que ya hemos completados las maximas vueltas y debemos acabar
        if (posicionLetraActualJ2 == -1) {
            finalizadoJ2 = true;
            pierdeTurno = true;
        } else {
            //Si no toca finalizar, actualizamos la definicion de la palabra actual
            definicionJ2.setText("Empieza por " + partida.getRosco2().getPalabras()[posicionLetraActualJ2].getInicial() + ":\n" + partida.getRosco2().getPalabras()[posicionLetraActualJ2].getDef1().toString());
            //Tambien borramos la ultima respuesta del textfield de resouesta
            respuestaJ2.setText("");
            //Tambien indicamos la letra actual
            letrasJ2.getComponent(posicionLetraActualJ2).setForeground(Color.BLUE);
        }
        //Si perdemos el turno, le pasamos el turno al jugador 2
        if (pierdeTurno) try {
            cambiarTurno(partida.getJugador1());
        } catch (EJugadorNoValidoException ex) {
            Logger.getLogger(PanellJugarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasarPalabraJ2ActionPerformed

    private void resultadoJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoJ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultadoJ2ActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        // Al pulsar el boton de ayuda se emite un mensaje con las instrucciones del juego
        JOptionPane.showMessageDialog(this, Partida.INSTRUCIONES, "Instrucciones de la partida:", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_ayudaActionPerformed

    private void forzarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forzarSalidaActionPerformed
        // Emitimos un mensaje de que no se dara el beneficio y damos opcion de salir o continuar
        if (JOptionPane.showConfirmDialog(this, "La opcion de salir implica que no se pueda perder el progreso de la partida, ¿desea usted salir?", "Forzar salida", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_forzarSalidaActionPerformed

    private int calcularPosicionPalabraSiguiente(Rosco rosco) {
        //Buscamos desde la posicion actual la prosima palabra no respondida o aplazada
        int posicion;
        JLabel vueltaActual;
        if (rosco == partida.getRosco1()) {
            posicion = posicionLetraActualJ1 + 1;
            vueltaActual = vueltaActualJ1;
        } else {
            posicion = posicionLetraActualJ2 + 1;
            vueltaActual = vueltaActualJ2;
        }
        if (posicion >= partida.getNumPalabras()) {
            //Si la proxima letra esta fuera del rango posible, volvemos a la primera sumando una vuelta
            rosco.setVuelta(rosco.getVuelta() + 1);
            vueltaActual.setText(String.valueOf(rosco.getVuelta()));
            posicion = 0;
        }
        boolean encontrada = false;
        while (!encontrada && rosco.getVuelta() <= Rosco.NUM_VUELTAS_MAX) {
            if (rosco.getPalabras()[posicion].getFallada() || rosco.getPalabras()[posicion].getAcertada()) {
                //Si no esta ni acertada ni fallada, la pasamos ya que no nos vale
                posicion++;
                if (posicion >= rosco.getNumLetras()) {
                    //Si la proxima letra esta fuera del rango posible, volvemos a la primera sumando una vuelta
                    rosco.setVuelta(rosco.getVuelta() + 1);
                    vueltaActual.setText(String.valueOf(rosco.getVuelta()));
                    posicion = 0;
                }
            } else {
                //Si esta aplazada o no esta ni aplazada ni fallada ni acertada, nos vale, paramos de buscar
                encontrada = true;
            }
        }
        //Si hemos parado porque el numero de vueltas supera el maximo, devolvemos -1
        if (rosco.getVuelta() > Rosco.NUM_VUELTAS_MAX) {
            return -1;
        } //Sino, devolvemos la posicion
        else {
            return posicion;
        }
    }

    public void finalizarPartida(Jugador ganador) throws EJugadorNoValidoException {
        //Si el ganador es nulo, tenemos un empate o ninguno ha completado todo el rosco con aciertos
        //Finalizamos emitiendo un mensaje, sumando los puntos de la forma adecuada y saliendo
        //Sumamos puntos
        if (ganador == null) {
            //Comprobamos si tenemos empate o hay un verdadero ganador
            ganador = partida.getGanador();
            if (ganador == null) {
                //Sumamos 5 puntos a cada uno
                partida.getJugador1().setPuntos(partida.getJugador1().getPuntos() + PUNTOS_EMPATE);
                partida.getJugador2().setPuntos(partida.getJugador2().getPuntos() + PUNTOS_EMPATE);
                //Actualizamos las estadisticas
                partida.getJugador1().getEstadisticas().setPartidasEmpatadas(partida.getJugador1().getEstadisticas().getPartidasEmpatadas() + 1);
                partida.getJugador1().getEstadisticas().setPartidasJugadas(partida.getJugador1().getEstadisticas().getPartidasJugadas() + 1);
                partida.getJugador1().getEstadisticas().setPuntosConseguidos(partida.getJugador1().getEstadisticas().getPuntosConseguidos() + PUNTOS_EMPATE);
                partida.getJugador2().getEstadisticas().setPartidasEmpatadas(partida.getJugador2().getEstadisticas().getPartidasEmpatadas() + 1);
                partida.getJugador2().getEstadisticas().setPartidasJugadas(partida.getJugador2().getEstadisticas().getPartidasJugadas() + 1);
                partida.getJugador2().getEstadisticas().setPuntosConseguidos(partida.getJugador2().getEstadisticas().getPuntosConseguidos() + PUNTOS_EMPATE);
            } else {
                //Le sumamos 10 puntos al ganador
                ganador.setPuntos(ganador.getPuntos() + PUNTOS_GANADOR);
                //Actualizamos las estadisticas
                ganador.getEstadisticas().setPartidasGanadas(ganador.getEstadisticas().getPartidasGanadas() + 1);
                ganador.getEstadisticas().setPartidasJugadas(ganador.getEstadisticas().getPartidasJugadas() + 1);
                ganador.getEstadisticas().setPuntosConseguidos(ganador.getEstadisticas().getPuntosConseguidos() + PUNTOS_GANADOR);
                if (ganador.equals(partida.getJugador1())) {
                    //Pierde el 2
                    partida.getJugador2().getEstadisticas().setPartidasPerdidas(partida.getJugador2().getEstadisticas().getPartidasPerdidas() + 1);
                    partida.getJugador2().getEstadisticas().setPartidasJugadas(partida.getJugador2().getEstadisticas().getPartidasJugadas() + 1);
                } else {
                    //Pierde el 1
                    partida.getJugador1().getEstadisticas().setPartidasPerdidas(partida.getJugador1().getEstadisticas().getPartidasPerdidas() + 1);
                    partida.getJugador1().getEstadisticas().setPartidasJugadas(partida.getJugador1().getEstadisticas().getPartidasJugadas() + 1);
                }
            }
        } else {
            //Si hay ganador significa que un jugador ha completado todo el rosco con solo aciertos
            //Le sumamos 100 puntos y terminamos
            ganador.setPuntos(ganador.getPuntos() + PUNTOS_ACERTAR_TODO);
            //Actualizamos las estadisticas
            ganador.getEstadisticas().setPartidasGanadas(ganador.getEstadisticas().getPartidasGanadas() + 1);
            ganador.getEstadisticas().setPartidasJugadas(ganador.getEstadisticas().getPartidasJugadas() + 1);
            ganador.getEstadisticas().setPuntosConseguidos(ganador.getEstadisticas().getPuntosConseguidos() + PUNTOS_ACERTAR_TODO);
            if (ganador.equals(partida.getJugador1())) {
                //Pierde el 2
                partida.getJugador2().getEstadisticas().setPartidasPerdidas(partida.getJugador2().getEstadisticas().getPartidasPerdidas() + 1);
                partida.getJugador2().getEstadisticas().setPartidasJugadas(partida.getJugador2().getEstadisticas().getPartidasJugadas() + 1);
            } else {
                //Pierde el 1
                partida.getJugador1().getEstadisticas().setPartidasPerdidas(partida.getJugador1().getEstadisticas().getPartidasPerdidas() + 1);
                partida.getJugador1().getEstadisticas().setPartidasJugadas(partida.getJugador1().getEstadisticas().getPartidasJugadas() + 1);
            }
        }
        //Añadimos las partidas a las partidas jugadas de cada uno 
        partida.getJugador1().getPartidasJugadas().add(partida);
        partida.getJugador2().getPartidasJugadas().add(partida);
        //Mostramos resultado y salimos
        StringBuilder mensaje = new StringBuilder("Enhorabuena, " + partida.getJugador1().getNombre() + " y " + partida.getJugador2().getNombre() + ", su partida ha finalizado con exito\n");
        mensaje.append("Resultados:\n" + partida.toString());
        mensaje.append("Gracias por jugar");
        resultadoJ1.setText("Fin de la partida");
        resultadoJ1.setForeground(Color.BLACK);
        resultadoJ2.setText("Fin de la partida");
        resultadoJ2.setForeground(Color.BLACK);
        JOptionPane.showMessageDialog(this, mensaje.toString(), "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

    public void cambiarTurno(Jugador jugador) throws EJugadorNoValidoException {
        //Cambiamos el turno, cediendoselo al jugador que nos pasan
        //Si uno de los 2 ya ha terminado, no podremos darle el turno a este
        //Si ambos han finalizado, finalizamos
        if (finalizadoJ1 && finalizadoJ2) {
            finalizarPartida(null);
        } else {
            //Comprobamos si le podemos pasar el turno al otro jugador
            //Si es el jugador 1 y no ha terminado, le cedemos el turno
            if (jugador == partida.getJugador1() && !finalizadoJ1) {
                //Simpremente deshabilitamos los componentes de uno y habilitamos los del otro
                for (Component c : componentesJ2) {
                    c.setEnabled(false);
                }
                for (Component c : componentesJ1) {
                    c.setEnabled(true);
                }
            } //Sino si es el jugador 2 y no ha terminado, lecedemos el turno a este
            else if (!finalizadoJ2) {
                //Simpremente deshabilitamos los componentes de uno y habilitamos los del otro
                for (Component c : componentesJ1) {
                    c.setEnabled(false);
                }
                for (Component c : componentesJ2) {
                    c.setEnabled(true);
                }
            }
        }
        //Si no podemos pasar el turno, simplemente no lo hacemos, conservandolo el jugador que lo tenia
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ayuda;
    private javax.swing.JTextArea definicionJ1;
    private javax.swing.JTextArea definicionJ2;
    private javax.swing.JButton enviarPalabraJ1;
    private javax.swing.JButton enviarPalabraJ2;
    private javax.swing.JMenuItem forzarSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel letrasJ1;
    private javax.swing.JPanel letrasJ2;
    private javax.swing.JLabel nombreJugador1;
    private javax.swing.JLabel nombreJugador2;
    private javax.swing.JLabel palabrasAcertadasJ1;
    private javax.swing.JLabel palabrasAcertadasJ2;
    private javax.swing.JLabel palabrasFalladasJ1;
    private javax.swing.JLabel palabrasFalladasJ2;
    private javax.swing.JPanel panelJ1;
    private javax.swing.JPanel panelJ2;
    private javax.swing.JButton pasarPalabraJ1;
    private javax.swing.JButton pasarPalabraJ2;
    private javax.swing.JButton recibirAyudaJ1;
    private javax.swing.JButton recibirAyudaJ2;
    private javax.swing.JTextField respuestaJ1;
    private javax.swing.JTextField respuestaJ2;
    private javax.swing.JTextField resultadoJ1;
    private javax.swing.JTextField resultadoJ2;
    private javax.swing.JLabel vueltaActualJ1;
    private javax.swing.JLabel vueltaActualJ2;
    private javax.swing.JLabel vueltasMaxJ1;
    private javax.swing.JLabel vueltasMaxJ2;
    // End of variables declaration//GEN-END:variables
}
