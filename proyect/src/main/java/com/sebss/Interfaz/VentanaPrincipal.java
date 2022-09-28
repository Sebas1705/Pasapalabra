package com.sebss.Interfaz;

import com.sebss.Almacenes.*;
import com.sebss.Exceptions.*;
import com.sebss.Jugadores.*;
import com.sebss.Palabras.*;
import com.sebss.Partidas.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;


/**
 *
 * @author sebss
 */
public class VentanaPrincipal extends JFrame {

    //Atributtes:
    private Almacen_Jugadores aJugadores;
    private Almacen_Partidas aPartidas;
    private Almacen_Palabras aPalabras;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jModificar;
    private JDialog dialogActual;
    private final String ARCHIVO_AJUGADORES = "data\\bin\\Jugadores.data";
    private final String ARCHIVO_APARTIDAS = "data\\bin\\Partidas.data";
    private final String ARCHIVO_APALABRAS = "data\\bin\\Palabras.data";
    private final String ARCHIVO_TXT = "data\\bin\\Clasificacion.txt";
    private final ImageIcon image = new ImageIcon("data\\img\\P.png");
    //End of Atributtes.

    //Constructor:
    public VentanaPrincipal() {
        initAtributtes();
        initComponents();
        initFrame();
    }
    //End of constructor.

    //Inits:
    private void initAtributtes(){
        jugador1=null;
        jugador2=null;
        jModificar=null;
        dialogActual=null;
        aJugadores=new Almacen_Jugadores();
        aPartidas=new Almacen_Partidas();
        aPalabras=new Almacen_Palabras();
    }
    private void initComponents() {
        ventanaAdmin = new JDialog();
        fondoVA = new JPanel();
        tituloVA = new JTextField();
        contornoVA = new JPanel();
        jPanel6 = new JPanel();
        jScrollPane15 = new JScrollPane();
        areaPantallaVA = new JTextArea();
        cerrarVA = new JButton();
        cargarDatosVA = new JButton();
        guardarDatosVA = new JButton();
        modJugadoresVA = new JButton();
        modPartidasVA = new JButton();
        modPalabrasVA = new JButton();
        volverUsuarioVA = new JButton();
        labelCopyrights3 = new JLabel();
        labelFotoAdmin = new JLabel();
        jLabel2 = new JLabel();
        comprobarContraseña = new JDialog();
        fondoCC = new JPanel();
        buttonIntroducirCC = new JButton();
        buttonCancelarCC = new JButton();
        marcoContraseñaCC = new JPanel();
        fieldContraseñaCC = new JTextField();
        labelCopyrights4 = new JLabel();
        modificarJugadores = new JDialog();
        fondoMJ = new JPanel();
        tituloMJ = new JLabel();
        volverMJ = new JButton();
        jScrollPane3 = new JScrollPane();
        listJugadoresMJ = new JList<>();
        verInfoMJ = new JButton();
        bordePantallaMJ = new JPanel();
        jScrollPane4 = new JScrollPane();
        pantallaInfoMJ = new JTextArea();
        actualizarListaMJ = new JButton();
        crearJugadorMJ = new JButton();
        clasificacionMJ = new JButton();
        modificarJugadorMJ = new JButton();
        borrarJugadorMJ = new JButton();
        listaCompletaJugadores = new JButton();
        labelCopyrights5 = new JLabel();
        crearJugador = new JDialog();
        fondoCJ = new JPanel();
        tituloCJ = new JLabel();
        tituloNombreCJ = new JLabel();
        fieldNombreCJ = new JTextField();
        tituloClaveCJ = new JLabel();
        fieldClaveCJ = new JTextField();
        bordePantallaCJ = new JPanel();
        jScrollPane6 = new JScrollPane();
        areaPantallaCJ = new JTextArea();
        volverCJ = new JButton();
        crearJugadorCJ = new JButton();
        checkAdminCJ = new JCheckBox();
        labelCopyrights10 = new JLabel();
        modificarJugador = new JDialog();
        fondoMJu = new JPanel();
        jLabel3 = new JLabel();
        fieldPuntosMJu = new JTextField();
        tituloHistMJu = new JLabel();
        tituloNombreMJu = new JLabel();
        tituloClaveMJu = new JLabel();
        tituloPuntosMJu = new JLabel();
        fieldNombreMJu = new JTextField();
        fieldClaveMJu = new JTextField();
        jScrollPane5 = new JScrollPane();
        areaHistMJu = new JTextArea();
        volverMJu = new JButton();
        actualizarJugadorMJu = new JButton();
        labelCopyrights11 = new JLabel();
        modificarPartidas = new JDialog();
        fondoMP = new JPanel();
        jLabel4 = new JLabel();
        jScrollPane7 = new JScrollPane();
        listPartidasMP = new JList<>();
        verPartidasJugador = new JButton();
        bordePantallaMP = new JPanel();
        jScrollPane8 = new JScrollPane();
        areaPantallaMP = new JTextArea();
        tituloAlterarMP = new JLabel();
        volverMP = new JButton();
        borrarPartida = new JButton();
        partidasGlobalesMP = new JButton();
        alterarPartidaMP = new JButton();
        infoPartidaMP = new JButton();
        jScrollPane9 = new JScrollPane();
        listJugadoresMP = new JList<>();
        fieldMinutoMP = new JTextField();
        fieldDiaMP = new JTextField();
        fieldMesMP = new JTextField();
        fieldAñoMP = new JTextField();
        fieldHoraMP = new JTextField();
        labelCopyrights7 = new JLabel();
        labelInfo = new JLabel();
        tituloAlterarMP1 = new JLabel();
        tituloAlterarMP2 = new JLabel();
        modificarPalabras = new JDialog();
        fondoMPa = new JPanel();
        tituloMPa = new JLabel();
        jScrollPane10 = new JScrollPane();
        listLetrasMPa = new JList<>();
        jScrollPane11 = new JScrollPane();
        listPalabrasMPa = new JList<>();
        volverMPa = new JButton();
        verlistasMPa = new JButton();
        verPalabraMPa = new JButton();
        borrarPalabraMPa = new JButton();
        modificarPalabraMPa = new JButton();
        verPalabrasMPa = new JButton();
        bordePantallaMPa = new JPanel();
        jScrollPane12 = new JScrollPane();
        areaPantallaMPa = new JTextArea();
        fieldPalabraMPa = new JTextField();
        fieldDef1MPa = new JTextField();
        fieldDef2MPa = new JTextField();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        crearPalabraMPa = new JButton();
        labelCopyrights8 = new JLabel();
        seleccionJuego = new JDialog();
        fondoSJ = new JPanel();
        jLabel1 = new JLabel();
        buttonPartidaSJ = new JButton();
        buttonEntrenamiento = new JButton();
        volverSJ = new JButton();
        labelCopyrights9 = new JLabel();
        introducirJugadores = new JDialog();
        fondoIJ = new JPanel();
        tituloIJ = new JLabel();
        IntroducirJugador1IJ = new JButton();
        labelCopyrights12 = new JLabel();
        introducirJugador2IJ = new JButton();
        buttonVolverIJ = new JButton();
        nordeNombreIJ = new JPanel();
        fieldNombreIJ = new JTextField();
        jScrollPane2 = new JScrollPane();
        areaInfoIJ = new JTextArea();
        bordeContraseñaIJ = new JPanel();
        fieldContraseñaIJ = new JTextField();
        ventanaUsuario = new JDialog();
        fondoVU = new JPanel();
        tituloVU = new JTextField();
        contornoVU = new JPanel();
        fondoAreaVP2 = new JPanel();
        jScrollPane14 = new JScrollPane();
        areaVU = new JTextArea();
        cerrarVU = new JButton();
        jugarVU = new JButton();
        cargarJugadoresVU = new JButton();
        infoJugadorVU = new JButton();
        adminVU = new JButton();
        marcadorJugadorVU2 = new JLabel();
        marcadorJugadorVU1 = new JLabel();
        tituloJugadorVU1 = new JLabel();
        tituloJugadorVU2 = new JLabel();
        labelCopyrights2 = new JLabel();
        labelFoto = new JLabel();
        ventanaTerminos = new JDialog();
        jPanel4 = new JPanel();
        labelTitulo = new JLabel();
        checkbox1 = new JCheckBox();
        botonNO = new JButton();
        botonContinuar1 = new JButton();
        jLabel15 = new JLabel();
        jScrollPane13 = new JScrollPane();
        jTextArea2 = new JTextArea();
        labelCopyrights1 = new JLabel();
        cargarDatos = new JDialog();
        jPanel5 = new JPanel();
        radioJugadoresCD = new JRadioButton();
        radioPalabrasCD = new JRadioButton();
        volverCD = new JButton();
        archivoCD = new JButton();
        jLabel16 = new JLabel();
        escribirClasificacionCD = new JButton();
        labelCopyrights6 = new JLabel();
        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        labelCopyrights = new JLabel();
        labelLogo = new JLabel();
        botonInicio = new JButton();

        ventanaAdmin.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        ventanaAdmin.setTitle("Pasapalabra - Administrador");
        ventanaAdmin.setBounds(new Rectangle(0, 0, 615, 450));
        ventanaAdmin.setMinimumSize(null);
        ventanaAdmin.setResizable(false);
        ventanaAdmin.setSize(new Dimension(770, 650));

        fondoVA.setBackground(new Color(244, 241, 234));
        fondoVA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloVA.setEditable(false);
        tituloVA.setBackground(new Color(83, 119, 143));
        tituloVA.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        tituloVA.setForeground(Color.white);
        tituloVA.setHorizontalAlignment(JTextField.CENTER);
        tituloVA.setText("Menu Administrador");
        tituloVA.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        fondoVA.add(tituloVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 60));

        contornoVA.setBackground(new Color(83, 119, 143));
        contornoVA.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Modo Admin", TitledBorder.LEFT, TitledBorder.BOTTOM, new Font("Segoe Print", 1, 12), new Color(83, 119, 143))); // NOI18N
        contornoVA.setForeground(new Color(83, 119, 143));
        contornoVA.setToolTipText("");
        contornoVA.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        contornoVA.setOpaque(false);
        contornoVA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane15.setForeground(new Color(83, 119, 143));

        areaPantallaVA.setEditable(false);
        areaPantallaVA.setColumns(20);
        areaPantallaVA.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaPantallaVA.setForeground(new Color(83, 119, 143));
        areaPantallaVA.setRows(5);
        jScrollPane15.setViewportView(areaPantallaVA);

        GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane15, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        contornoVA.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 200));

        fondoVA.add(contornoVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 340, 250));

        cerrarVA.setBackground(new Color(255, 102, 102));
        cerrarVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        cerrarVA.setForeground(Color.white);
        cerrarVA.setText("Cerrar Aplicación");
        cerrarVA.setBorder(null);
        cerrarVA.setFocusable(false);
        cerrarVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cerrarVAActionPerformed(evt);
            }
        });
        fondoVA.add(cerrarVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 160, 60));

        cargarDatosVA.setBackground(new Color(83, 119, 143));
        cargarDatosVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        cargarDatosVA.setForeground(Color.white);
        cargarDatosVA.setText("Cargar Datos");
        cargarDatosVA.setBorder(null);
        cargarDatosVA.setFocusable(false);
        cargarDatosVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cargarDatosVAActionPerformed(evt);
            }
        });
        fondoVA.add(cargarDatosVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 40));

        guardarDatosVA.setBackground(new Color(83, 119, 143));
        guardarDatosVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        guardarDatosVA.setForeground(Color.white);
        guardarDatosVA.setText("Guardar Datos");
        guardarDatosVA.setBorder(null);
        guardarDatosVA.setFocusable(false);
        guardarDatosVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guardarDatosVAActionPerformed(evt);
            }
        });
        fondoVA.add(guardarDatosVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, 40));

        modJugadoresVA.setBackground(new Color(83, 119, 143));
        modJugadoresVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        modJugadoresVA.setForeground(Color.white);
        modJugadoresVA.setText("Modificar Jugadores");
        modJugadoresVA.setBorder(null);
        modJugadoresVA.setFocusable(false);
        modJugadoresVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modJugadoresVAActionPerformed(evt);
            }
        });
        fondoVA.add(modJugadoresVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 40));

        modPartidasVA.setBackground(new Color(83, 119, 143));
        modPartidasVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        modPartidasVA.setForeground(Color.white);
        modPartidasVA.setText("Modificar Partidas");
        modPartidasVA.setBorder(null);
        modPartidasVA.setFocusable(false);
        modPartidasVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modPartidasVAActionPerformed(evt);
            }
        });
        fondoVA.add(modPartidasVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 40));

        modPalabrasVA.setBackground(new Color(83, 119, 143));
        modPalabrasVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        modPalabrasVA.setForeground(Color.white);
        modPalabrasVA.setText("Modificar Palabras");
        modPalabrasVA.setBorder(null);
        modPalabrasVA.setFocusable(false);
        modPalabrasVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modPalabrasVAActionPerformed(evt);
            }
        });
        fondoVA.add(modPalabrasVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 180, 40));

        volverUsuarioVA.setBackground(new Color(248, 216, 216));
        volverUsuarioVA.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        volverUsuarioVA.setForeground(new Color(83, 119, 143));
        volverUsuarioVA.setText("Volver Menu Usuario");
        volverUsuarioVA.setBorder(null);
        volverUsuarioVA.setBorderPainted(false);
        volverUsuarioVA.setFocusable(false);
        volverUsuarioVA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverUsuarioVAActionPerformed(evt);
            }
        });
        fondoVA.add(volverUsuarioVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 180, 60));

        labelCopyrights3.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights3.setForeground(new Color(83, 119, 143));
        labelCopyrights3.setText("©2022 The CSC Company");
        fondoVA.add(labelCopyrights3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));
        fondoVA.add(labelFotoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 240, 200));

        jLabel2.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setForeground(new Color(83, 119, 143));
        jLabel2.setText("Pantalla Informacion");
        fondoVA.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        GroupLayout ventanaAdminLayout = new GroupLayout(ventanaAdmin.getContentPane());
        ventanaAdmin.getContentPane().setLayout(ventanaAdminLayout);
        ventanaAdminLayout.setHorizontalGroup(
            ventanaAdminLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoVA, GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        ventanaAdminLayout.setVerticalGroup(
            ventanaAdminLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoVA, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        comprobarContraseña.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        comprobarContraseña.setTitle("Pasapalabra - Inicio Sesion Admin");
        comprobarContraseña.setBounds(new Rectangle(0, 0, 280, 400));
        comprobarContraseña.setMinimumSize(null);
        comprobarContraseña.setModal(true);
        comprobarContraseña.setResizable(false);
        comprobarContraseña.setSize(new Dimension(365, 290));

        fondoCC.setBackground(new Color(244, 241, 234));
        fondoCC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonIntroducirCC.setBackground(new Color(83, 119, 143));
        buttonIntroducirCC.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        buttonIntroducirCC.setForeground(Color.white);
        buttonIntroducirCC.setText("INTRODUCIR");
        buttonIntroducirCC.setBorder(null);
        buttonIntroducirCC.setFocusable(false);
        buttonIntroducirCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonIntroducirCCActionPerformed(evt);
            }
        });
        fondoCC.add(buttonIntroducirCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 30));

        buttonCancelarCC.setBackground(new Color(248, 216, 216));
        buttonCancelarCC.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        buttonCancelarCC.setForeground(new Color(83, 119, 143));
        buttonCancelarCC.setText("CANCELAR");
        buttonCancelarCC.setBorder(null);
        buttonCancelarCC.setFocusable(false);
        buttonCancelarCC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonCancelarCCActionPerformed(evt);
            }
        });
        fondoCC.add(buttonCancelarCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 140, 30));

        marcoContraseñaCC.setBackground(new Color(244, 241, 234));
        marcoContraseñaCC.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Introduzca su contraseña de admin:", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe Print", 1, 11), new Color(83, 119, 143))); // NOI18N
        marcoContraseñaCC.setForeground(new Color(83, 119, 143));
        marcoContraseñaCC.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        marcoContraseñaCC.setOpaque(false);
        marcoContraseñaCC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldContraseñaCC.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        fieldContraseñaCC.setForeground(new Color(83, 119, 143));
        fieldContraseñaCC.setHorizontalAlignment(JTextField.CENTER);
        fieldContraseñaCC.setBorder(BorderFactory.createEtchedBorder());
        marcoContraseñaCC.add(fieldContraseñaCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 50));

        fondoCC.add(marcoContraseñaCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, 80));

        labelCopyrights4.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights4.setForeground(new Color(83, 119, 143));
        labelCopyrights4.setText("©2022 The CSC Company");
        fondoCC.add(labelCopyrights4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        GroupLayout comprobarContraseñaLayout = new GroupLayout(comprobarContraseña.getContentPane());
        comprobarContraseña.getContentPane().setLayout(comprobarContraseñaLayout);
        comprobarContraseñaLayout.setHorizontalGroup(
            comprobarContraseñaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoCC, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );
        comprobarContraseñaLayout.setVerticalGroup(
            comprobarContraseñaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoCC, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        modificarJugadores.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        modificarJugadores.setTitle("Pasapalabra - Modificar Jugadores");
        modificarJugadores.setBounds(new Rectangle(0, 0, 650, 450));
        modificarJugadores.setMinimumSize(null);
        modificarJugadores.setModal(true);
        modificarJugadores.setResizable(false);
        modificarJugadores.setSize(new Dimension(840, 545));

        fondoMJ.setBackground(new Color(244, 241, 234));
        fondoMJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMJ.setBackground(new Color(83, 119, 143));
        tituloMJ.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        tituloMJ.setForeground(new Color(255, 255, 255));
        tituloMJ.setHorizontalAlignment(SwingConstants.CENTER);
        tituloMJ.setText("Modificar Jugadores");
        tituloMJ.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        tituloMJ.setOpaque(true);
        fondoMJ.add(tituloMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 770, 60));

        volverMJ.setBackground(new Color(248, 216, 216));
        volverMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        volverMJ.setForeground(new Color(83, 119, 143));
        volverMJ.setFocusable(false);
        volverMJ.setText("Volver");
        volverMJ.setBorder(null);
        volverMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverMJActionPerformed(evt);
            }
        });
        fondoMJ.add(volverMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 140, 30));

        jScrollPane3.setBackground(Color.white);
        jScrollPane3.setForeground(new Color(83, 119, 143));

        listJugadoresMJ.setBorder(BorderFactory.createEtchedBorder());
        listJugadoresMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        listJugadoresMJ.setForeground(new Color(83, 119, 143));
        listJugadoresMJ.setModel(new AbstractListModel<String>() {
            String[] strings = { "Jugador1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listJugadoresMJ);

        fondoMJ.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 380));

        verInfoMJ.setBackground(new Color(83, 119, 143));
        verInfoMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        verInfoMJ.setForeground(Color.white);
        verInfoMJ.setText("Ver Info");
        verInfoMJ.setFocusable(false);
        verInfoMJ.setBorder(null);
        verInfoMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                verInfoMJActionPerformed(evt);
            }
        });
        fondoMJ.add(verInfoMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 140, 40));

        bordePantallaMJ.setBackground(Color.white);
        bordePantallaMJ.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Pantalla Info", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("Segoe Print", 0, 12), new Color(83, 119, 143))); // NOI18N
        bordePantallaMJ.setForeground(new Color(83, 119, 143));
        bordePantallaMJ.setOpaque(false);
        bordePantallaMJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantallaInfoMJ.setEditable(false);
        pantallaInfoMJ.setColumns(20);
        pantallaInfoMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        pantallaInfoMJ.setForeground(new Color(83, 119, 143));
        pantallaInfoMJ.setRows(5);
        pantallaInfoMJ.setBorder(BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(pantallaInfoMJ);

        bordePantallaMJ.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 290));

        fondoMJ.add(bordePantallaMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 410, 340));

        actualizarListaMJ.setBackground(new Color(83, 119, 143));
        actualizarListaMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        actualizarListaMJ.setForeground(Color.white);
        actualizarListaMJ.setText("Actualizar");
        actualizarListaMJ.setFocusable(false);
        actualizarListaMJ.setBorder(null);
        actualizarListaMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actualizarListaMJActionPerformed(evt);
            }
        });
        fondoMJ.add(actualizarListaMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 140, 40));

        crearJugadorMJ.setBackground(new Color(83, 119, 143));
        crearJugadorMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        crearJugadorMJ.setForeground(Color.white);
        crearJugadorMJ.setText("Crear Jugador");
        crearJugadorMJ.setFocusable(false);
        crearJugadorMJ.setBorder(null);
        crearJugadorMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                crearJugadorMJActionPerformed(evt);
            }
        });
        fondoMJ.add(crearJugadorMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 140, 40));

        clasificacionMJ.setBackground(new Color(83, 119, 143));
        clasificacionMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        clasificacionMJ.setForeground(Color.white);
        clasificacionMJ.setText("Clasificación");
        clasificacionMJ.setFocusable(false);
        clasificacionMJ.setBorder(null);
        clasificacionMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                clasificacionMJActionPerformed(evt);
            }
        });
        fondoMJ.add(clasificacionMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 140, 40));

        modificarJugadorMJ.setBackground(new Color(83, 119, 143));
        modificarJugadorMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        modificarJugadorMJ.setForeground(Color.white);
        modificarJugadorMJ.setText("Modificar Jugador");
        modificarJugadorMJ.setFocusable(false);
        modificarJugadorMJ.setBorder(null);
        modificarJugadorMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modificarJugadorMJActionPerformed(evt);
            }
        });
        fondoMJ.add(modificarJugadorMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 140, 40));

        borrarJugadorMJ.setBackground(new Color(83, 119, 143));
        borrarJugadorMJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        borrarJugadorMJ.setForeground(Color.white);
        borrarJugadorMJ.setText("Borrar Jugador");
        borrarJugadorMJ.setFocusable(false);
        borrarJugadorMJ.setBorder(null);
        borrarJugadorMJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrarJugadorMJActionPerformed(evt);
            }
        });
        fondoMJ.add(borrarJugadorMJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 140, 40));

        listaCompletaJugadores.setBackground(new Color(83, 119, 143));
        listaCompletaJugadores.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        listaCompletaJugadores.setForeground(Color.white);
        listaCompletaJugadores.setText("Lista Completa");
        listaCompletaJugadores.setFocusable(false);
        listaCompletaJugadores.setBorder(null);
        listaCompletaJugadores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                listaCompletaJugadoresActionPerformed(evt);
            }
        });
        fondoMJ.add(listaCompletaJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 140, 40));

        labelCopyrights5.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights5.setForeground(new Color(83, 119, 143));
        labelCopyrights5.setText("©2022 The CSC Company");
        fondoMJ.add(labelCopyrights5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        GroupLayout modificarJugadoresLayout = new GroupLayout(modificarJugadores.getContentPane());
        modificarJugadores.getContentPane().setLayout(modificarJugadoresLayout);
        modificarJugadoresLayout.setHorizontalGroup(
            modificarJugadoresLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMJ, GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        modificarJugadoresLayout.setVerticalGroup(
            modificarJugadoresLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMJ, GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        crearJugador.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        crearJugador.setTitle("Pasapalabra - Crear Jugador");
        crearJugador.setBounds(new Rectangle(0, 0, 620, 320));
        crearJugador.setLocation(new Point(620, 340));
        crearJugador.setMinimumSize(null);
        crearJugador.setModal(true);
        crearJugador.setResizable(false);
        crearJugador.setSize(new Dimension(710, 390));

        fondoCJ.setBackground(new Color(244, 241, 234));
        fondoCJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloCJ.setBackground(new Color(83, 119, 143));
        tituloCJ.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        tituloCJ.setForeground(new Color(255, 255, 255));
        tituloCJ.setHorizontalAlignment(SwingConstants.CENTER);
        tituloCJ.setText("Crear Jugador");
        tituloCJ.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        tituloCJ.setOpaque(true);
        fondoCJ.add(tituloCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 660, 60));

        tituloNombreCJ.setBackground(new Color(244, 241, 234));
        tituloNombreCJ.setFont(new Font("Segoe Print", 1, 18)); // NOI18N
        tituloNombreCJ.setForeground(new Color(83, 119, 143));
        tituloNombreCJ.setText("Nuevo Nombre:");
        fondoCJ.add(tituloNombreCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 150, 40));

        fieldNombreCJ.setFont(new Font("Segoe Print", 0, 18)); // NOI18N
        fieldNombreCJ.setForeground(new Color(83, 119, 143));
        fieldNombreCJ.setBorder(BorderFactory.createEtchedBorder());
        fondoCJ.add(fieldNombreCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, 40));

        tituloClaveCJ.setBackground(new Color(244, 241, 234));
        tituloClaveCJ.setFont(new Font("Segoe Print", 1, 18)); // NOI18N
        tituloClaveCJ.setForeground(new Color(83, 119, 143));
        tituloClaveCJ.setText("Nueva Clave:");
        fondoCJ.add(tituloClaveCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 40));

        fieldClaveCJ.setFont(new Font("Segoe Print", 0, 18)); // NOI18N
        fieldClaveCJ.setForeground(new Color(83, 119, 143));
        fieldClaveCJ.setBorder(BorderFactory.createEtchedBorder());
        fondoCJ.add(fieldClaveCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 160, 40));

        bordePantallaCJ.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Pantalla Info", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("Segoe Print", 0, 12), new Color(83, 119, 143))); // NOI18N
        bordePantallaCJ.setOpaque(false);

        areaPantallaCJ.setEditable(false);
        areaPantallaCJ.setColumns(20);
        areaPantallaCJ.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaPantallaCJ.setForeground(new Color(83, 119, 143));
        areaPantallaCJ.setRows(5);
        jScrollPane6.setViewportView(areaPantallaCJ);

        GroupLayout bordePantallaCJLayout = new GroupLayout(bordePantallaCJ);
        bordePantallaCJ.setLayout(bordePantallaCJLayout);
        bordePantallaCJLayout.setHorizontalGroup(
            bordePantallaCJLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(bordePantallaCJLayout.createSequentialGroup()
                .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addContainerGap())
        );
        bordePantallaCJLayout.setVerticalGroup(
            bordePantallaCJLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        fondoCJ.add(bordePantallaCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 320, 170));

        volverCJ.setBackground(new Color(248, 216, 216));
        volverCJ.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        volverCJ.setForeground(new Color(83, 119, 143));
        volverCJ.setText("Volver");
        volverCJ.setBorder(null);
        volverCJ.setFocusable(false);
        volverCJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverCJActionPerformed(evt);
            }
        });
        fondoCJ.add(volverCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 30));

        crearJugadorCJ.setBackground(new Color(83, 119, 143));
        crearJugadorCJ.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        crearJugadorCJ.setForeground(Color.white);
        crearJugadorCJ.setText("Crear Jugador");
        crearJugadorCJ.setBorder(null);
        crearJugadorCJ.setFocusable(false);
        crearJugadorCJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                crearJugadorCJActionPerformed(evt);
            }
        });
        fondoCJ.add(crearJugadorCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 100, 30));

        checkAdminCJ.setBackground(new Color(244, 241, 234));
        checkAdminCJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        checkAdminCJ.setForeground(new Color(83, 119, 143));
        checkAdminCJ.setText("Crear Admin");
        checkAdminCJ.setFocusable(false);
        fondoCJ.add(checkAdminCJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, 30));

        labelCopyrights10.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights10.setForeground(new Color(83, 119, 143));
        labelCopyrights10.setText("©2022 The CSC Company");
        fondoCJ.add(labelCopyrights10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        GroupLayout crearJugadorLayout = new GroupLayout(crearJugador.getContentPane());
        crearJugador.getContentPane().setLayout(crearJugadorLayout);
        crearJugadorLayout.setHorizontalGroup(
            crearJugadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoCJ, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        crearJugadorLayout.setVerticalGroup(
            crearJugadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoCJ, GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );

        modificarJugador.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        modificarJugador.setTitle("Pasapalabra - Modificar Jugador");
        modificarJugador.setBounds(new Rectangle(0, 0, 620, 340));
        modificarJugador.setMinimumSize(null);
        modificarJugador.setModal(true);
        modificarJugador.setResizable(false);
        modificarJugador.setSize(new Dimension(645, 405));

        fondoMJu.setBackground(new Color(244, 241, 234));
        fondoMJu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new Color(83, 119, 143));
        jLabel3.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Modificar Jugador");
        jLabel3.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        fondoMJu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 50));

        fieldPuntosMJu.setFont(new Font("Segoe Print", 0, 18)); // NOI18N
        fieldPuntosMJu.setForeground(new Color(83, 119, 143));
        fieldPuntosMJu.setBorder(BorderFactory.createEtchedBorder());
        fondoMJu.add(fieldPuntosMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, 40));

        tituloHistMJu.setFont(new Font("Segoe Print", 0, 24)); // NOI18N
        tituloHistMJu.setForeground(new Color(83, 119, 143));
        tituloHistMJu.setHorizontalAlignment(SwingConstants.CENTER);
        tituloHistMJu.setText("Historia");
        fondoMJu.add(tituloHistMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 60));

        tituloNombreMJu.setFont(new Font("Segoe Print", 1, 24)); // NOI18N
        tituloNombreMJu.setForeground(new Color(83, 119, 143));
        tituloNombreMJu.setHorizontalAlignment(SwingConstants.CENTER);
        tituloNombreMJu.setText("Nombre:");
        fondoMJu.add(tituloNombreMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 40));

        tituloClaveMJu.setFont(new Font("Segoe Print", 1, 24)); // NOI18N
        tituloClaveMJu.setForeground(new Color(83, 119, 143));
        tituloClaveMJu.setHorizontalAlignment(SwingConstants.CENTER);
        tituloClaveMJu.setText("Clave:");
        fondoMJu.add(tituloClaveMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 40));

        tituloPuntosMJu.setFont(new Font("Segoe Print", 1, 24)); // NOI18N
        tituloPuntosMJu.setForeground(new Color(83, 119, 143));
        tituloPuntosMJu.setHorizontalAlignment(SwingConstants.CENTER);
        tituloPuntosMJu.setText("Puntos:");
        fondoMJu.add(tituloPuntosMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 40));

        fieldNombreMJu.setFont(new Font("Segoe Print", 0, 18)); // NOI18N
        fieldNombreMJu.setForeground(new Color(83, 119, 143));
        fieldNombreMJu.setBorder(BorderFactory.createEtchedBorder());
        fondoMJu.add(fieldNombreMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 140, 40));

        fieldClaveMJu.setFont(new Font("Segoe Print", 0, 18)); // NOI18N
        fieldClaveMJu.setForeground(new Color(83, 119, 143));
        fieldClaveMJu.setBorder(BorderFactory.createEtchedBorder());
        fondoMJu.add(fieldClaveMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, 40));

        areaHistMJu.setEditable(false);
        areaHistMJu.setColumns(20);
        areaHistMJu.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaHistMJu.setForeground(new Color(83, 119, 143));
        areaHistMJu.setRows(5);
        areaHistMJu.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        jScrollPane5.setViewportView(areaHistMJu);

        fondoMJu.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 260, 140));

        volverMJu.setBackground(new Color(248, 216, 216));
        volverMJu.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        volverMJu.setForeground(new Color(83, 119, 143));
        volverMJu.setText("Volver");
        volverMJu.setFocusable(false);
        volverMJu.setBorder(null);
        volverMJu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverMJuActionPerformed(evt);
            }
        });
        fondoMJu.add(volverMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 80, 30));

        actualizarJugadorMJu.setBackground(new Color(83, 119, 143));
        actualizarJugadorMJu.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        actualizarJugadorMJu.setForeground(Color.white);
        actualizarJugadorMJu.setText("Actualizar Jugador");
        actualizarJugadorMJu.setFocusable(false);
        actualizarJugadorMJu.setBorder(null);
        actualizarJugadorMJu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                actualizarJugadorMJuActionPerformed(evt);
            }
        });
        fondoMJu.add(actualizarJugadorMJu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, 30));

        labelCopyrights11.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights11.setForeground(new Color(83, 119, 143));
        labelCopyrights11.setText("©2022 The CSC Company");
        fondoMJu.add(labelCopyrights11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        GroupLayout modificarJugadorLayout = new GroupLayout(modificarJugador.getContentPane());
        modificarJugador.getContentPane().setLayout(modificarJugadorLayout);
        modificarJugadorLayout.setHorizontalGroup(
            modificarJugadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMJu, GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        modificarJugadorLayout.setVerticalGroup(
            modificarJugadorLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMJu, GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        modificarPartidas.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        modificarPartidas.setTitle("Pasapalabra - Modificar Partidas");
        modificarPartidas.setBounds(new Rectangle(0, 0, 650, 460));
        modificarPartidas.setMinimumSize(null);
        modificarPartidas.setModal(true);
        modificarPartidas.setResizable(false);
        modificarPartidas.setSize(new Dimension(865, 535));

        fondoMP.setBackground(new Color(244, 241, 234));
        fondoMP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new Color(83, 119, 143));
        jLabel4.setFont(new Font("Segoe Print", 0, 36)); // NOI18N
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Modificar Partidas");
        jLabel4.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        fondoMP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 800, 60));

        listPartidasMP.setBorder(BorderFactory.createEtchedBorder());
        listPartidasMP.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        listPartidasMP.setForeground(new Color(83, 119, 143));
        jScrollPane7.setViewportView(listPartidasMP);

        fondoMP.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 290, 140));

        verPartidasJugador.setBackground(new Color(83, 119, 143));
        verPartidasJugador.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        verPartidasJugador.setForeground(Color.white);
        verPartidasJugador.setText("Ver Partidas");
        verPartidasJugador.setFocusable(false);
        verPartidasJugador.setBorder(null);
        verPartidasJugador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                verPartidasJugadorActionPerformed(evt);
            }
        });
        fondoMP.add(verPartidasJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 140, 40));

        bordePantallaMP.setOpaque(false);
        bordePantallaMP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPantallaMP.setEditable(false);
        areaPantallaMP.setColumns(20);
        areaPantallaMP.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaPantallaMP.setForeground(new Color(83, 119, 143));
        areaPantallaMP.setRows(5);
        areaPantallaMP.setBorder(BorderFactory.createEtchedBorder());
        jScrollPane8.setViewportView(areaPantallaMP);

        bordePantallaMP.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 450, 180));

        tituloAlterarMP.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        tituloAlterarMP.setForeground(new Color(83, 119, 143));
        tituloAlterarMP.setHorizontalAlignment(SwingConstants.CENTER);
        tituloAlterarMP.setText("Pantalla informacion partida");
        bordePantallaMP.add(tituloAlterarMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 300, 30));

        fondoMP.add(bordePantallaMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 500, 230));

        volverMP.setBackground(new Color(248, 216, 216));
        volverMP.setFont(new Font("Segoe Print", 1, 14)); // NOI18N
        volverMP.setForeground(new Color(83, 119, 143));
        volverMP.setText("Volver");
        volverMP.setFocusable(false);
        volverMP.setBorder(null);
        volverMP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverMPActionPerformed(evt);
            }
        });
        fondoMP.add(volverMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, 140, 40));

        borrarPartida.setBackground(new Color(83, 119, 143));
        borrarPartida.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        borrarPartida.setForeground(Color.white);
        borrarPartida.setText("Borrar Partida");
        borrarPartida.setFocusable(false);
        borrarPartida.setBorder(null);
        borrarPartida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrarPartidaActionPerformed(evt);
            }
        });
        fondoMP.add(borrarPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 140, 40));

        partidasGlobalesMP.setBackground(new Color(83, 119, 143));
        partidasGlobalesMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        partidasGlobalesMP.setForeground(Color.white);
        partidasGlobalesMP.setText(" Partidas Globales");
        partidasGlobalesMP.setFocusable(false);
        partidasGlobalesMP.setBorder(null);
        partidasGlobalesMP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                partidasGlobalesMPActionPerformed(evt);
            }
        });
        fondoMP.add(partidasGlobalesMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 140, 40));

        alterarPartidaMP.setBackground(new Color(83, 119, 143));
        alterarPartidaMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        alterarPartidaMP.setForeground(Color.white);
        alterarPartidaMP.setText("Alterar Fecha");
        alterarPartidaMP.setFocusable(false);
        alterarPartidaMP.setBorder(null);
        alterarPartidaMP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                alterarPartidaMPActionPerformed(evt);
            }
        });
        fondoMP.add(alterarPartidaMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 140, 40));

        infoPartidaMP.setBackground(new Color(83, 119, 143));
        infoPartidaMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        infoPartidaMP.setForeground(Color.white);
        infoPartidaMP.setText("Ver Info Partida");
        infoPartidaMP.setFocusable(false);
        infoPartidaMP.setBorder(null);
        infoPartidaMP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                infoPartidaMPActionPerformed(evt);
            }
        });
        fondoMP.add(infoPartidaMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 140, 40));

        listJugadoresMP.setBorder(BorderFactory.createEtchedBorder());
        listJugadoresMP.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        listJugadoresMP.setForeground(new Color(83, 119, 143));
        jScrollPane9.setViewportView(listJugadoresMP);

        fondoMP.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 180));

        fieldMinutoMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        fieldMinutoMP.setForeground(new Color(83, 119, 143));
        fieldMinutoMP.setHorizontalAlignment(JTextField.CENTER);
        fieldMinutoMP.setBorder(BorderFactory.createEtchedBorder());
        fondoMP.add(fieldMinutoMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 60, 40));

        fieldDiaMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        fieldDiaMP.setForeground(new Color(83, 119, 143));
        fieldDiaMP.setHorizontalAlignment(JTextField.CENTER);
        fieldDiaMP.setBorder(BorderFactory.createEtchedBorder());
        fondoMP.add(fieldDiaMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 60, 40));

        fieldMesMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        fieldMesMP.setForeground(new Color(83, 119, 143));
        fieldMesMP.setHorizontalAlignment(JTextField.CENTER);
        fieldMesMP.setBorder(BorderFactory.createEtchedBorder());
        fondoMP.add(fieldMesMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 60, 40));

        fieldAñoMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        fieldAñoMP.setForeground(new Color(83, 119, 143));
        fieldAñoMP.setHorizontalAlignment(JTextField.CENTER);
        fieldAñoMP.setBorder(BorderFactory.createEtchedBorder());
        fondoMP.add(fieldAñoMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 60, 40));

        fieldHoraMP.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        fieldHoraMP.setForeground(new Color(83, 119, 143));
        fieldHoraMP.setHorizontalAlignment(JTextField.CENTER);
        fieldHoraMP.setBorder(BorderFactory.createEtchedBorder());
        fondoMP.add(fieldHoraMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 60, 40));

        labelCopyrights7.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights7.setForeground(new Color(83, 119, 143));
        labelCopyrights7.setText("©2022 The CSC Company");
        fondoMP.add(labelCopyrights7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        labelInfo.setFont(new Font("Segoe Print", 0, 18)); // NOI18N
        labelInfo.setForeground(new Color(83, 119, 143));
        labelInfo.setHorizontalAlignment(SwingConstants.CENTER);
        labelInfo.setText("Día/Mes/Año/Hora/Minuto");
        fondoMP.add(labelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 300, 30));

        tituloAlterarMP1.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        tituloAlterarMP1.setForeground(new Color(83, 119, 143));
        tituloAlterarMP1.setHorizontalAlignment(SwingConstants.CENTER);
        tituloAlterarMP1.setText("Pantalla informacion partida");
        fondoMP.add(tituloAlterarMP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 300, 30));

        tituloAlterarMP2.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        tituloAlterarMP2.setForeground(new Color(83, 119, 143));
        tituloAlterarMP2.setHorizontalAlignment(SwingConstants.CENTER);
        tituloAlterarMP2.setText("Pantalla lista partidas");
        fondoMP.add(tituloAlterarMP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 50));

        GroupLayout modificarPartidasLayout = new GroupLayout(modificarPartidas.getContentPane());
        modificarPartidas.getContentPane().setLayout(modificarPartidasLayout);
        modificarPartidasLayout.setHorizontalGroup(
            modificarPartidasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMP, GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
        );
        modificarPartidasLayout.setVerticalGroup(
            modificarPartidasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMP, GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
        );

        modificarPalabras.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        modificarPalabras.setTitle("Pasapalabra - Modificar Palabras");
        modificarPalabras.setBounds(new Rectangle(0, 0, 650, 460));
        modificarPalabras.setMinimumSize(null);
        modificarPalabras.setModal(true);
        modificarPalabras.setResizable(false);
        modificarPalabras.setSize(new Dimension(835, 660));

        fondoMPa.setBackground(new Color(244, 241, 234));
        fondoMPa.setForeground(new Color(83, 119, 143));
        fondoMPa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloMPa.setBackground(new Color(83, 119, 143));
        tituloMPa.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        tituloMPa.setForeground(new Color(255, 255, 255));
        tituloMPa.setHorizontalAlignment(SwingConstants.CENTER);
        tituloMPa.setText("Modificar Palabras");
        tituloMPa.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Segoe Print", 0, 12), new Color(83, 119, 143))); // NOI18N
        tituloMPa.setOpaque(true);
        fondoMPa.add(tituloMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 780, 60));

        listLetrasMPa.setBorder(BorderFactory.createEtchedBorder());
        listLetrasMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        listLetrasMPa.setForeground(new Color(83, 119, 143));
        listLetrasMPa.setModel(new AbstractListModel<String>() {
            String[] strings = { "Lista A", "Lista B", "Lista C", "Lista D", "Lista E", "Lista F", "Lista G", "Lista H", "Lista I", "Lista J", "Lista L", "Lista M", "Lista N", "Lista Ñ", "Lista O", "Lista P", "Lista Q", "Lista R", "Lista S", "Lista T", "Lista U", "Lista V", "Lista X", "Lista Y", "Lista Z" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(listLetrasMPa);

        fondoMPa.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 190));

        listPalabrasMPa.setBorder(BorderFactory.createEtchedBorder());
        listPalabrasMPa.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        listPalabrasMPa.setForeground(new Color(83, 119, 143));
        jScrollPane11.setViewportView(listPalabrasMPa);

        fondoMPa.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 210));

        volverMPa.setBackground(new Color(248, 216, 216));
        volverMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        volverMPa.setForeground(new Color(83, 119, 143));
        volverMPa.setText("Volver");
        volverMPa.setFocusable(false);
        volverMPa.setBorder(null);
        volverMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(volverMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, 140, 40));

        verlistasMPa.setBackground(new Color(83, 119, 143));
        verlistasMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        verlistasMPa.setForeground(Color.white);
        verlistasMPa.setText("Ver Lista");
        verlistasMPa.setFocusable(false);
        verlistasMPa.setBorder(null);
        verlistasMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                verlistasMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(verlistasMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 140, 40));

        verPalabraMPa.setBackground(new Color(83, 119, 143));
        verPalabraMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        verPalabraMPa.setForeground(Color.white);
        verPalabraMPa.setText("Ver Palabra");
        verPalabraMPa.setFocusable(false);
        verPalabraMPa.setBorder(null);
        verPalabraMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                verPalabraMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(verPalabraMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 140, 40));

        borrarPalabraMPa.setBackground(new Color(83, 119, 143));
        borrarPalabraMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        borrarPalabraMPa.setForeground(Color.white);
        borrarPalabraMPa.setText("Borrar Palabra");
        borrarPalabraMPa.setFocusable(false);
        borrarPalabraMPa.setBorder(null);
        borrarPalabraMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                borrarPalabraMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(borrarPalabraMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 140, 40));

        modificarPalabraMPa.setBackground(new Color(83, 119, 143));
        modificarPalabraMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        modificarPalabraMPa.setForeground(Color.white);
        modificarPalabraMPa.setText("Modificar Palabra");
        modificarPalabraMPa.setFocusable(false);
        modificarPalabraMPa.setBorder(null);
        modificarPalabraMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                modificarPalabraMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(modificarPalabraMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 140, 40));

        verPalabrasMPa.setBackground(new Color(83, 119, 143));
        verPalabrasMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        verPalabrasMPa.setForeground(Color.white);
        verPalabrasMPa.setText("Ver Palabras");
        verPalabrasMPa.setFocusable(false);
        verPalabrasMPa.setBorder(null);
        verPalabrasMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                verPalabrasMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(verPalabrasMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 140, 40));

        bordePantallaMPa.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Pantalla Info", TitledBorder.CENTER, TitledBorder.BOTTOM, new Font("Segoe Print", 0, 12), new Color(83, 119, 143))); // NOI18N
        bordePantallaMPa.setOpaque(false);
        bordePantallaMPa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        areaPantallaMPa.setEditable(false);
        areaPantallaMPa.setColumns(20);
        areaPantallaMPa.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaPantallaMPa.setForeground(new Color(83, 119, 143));
        areaPantallaMPa.setRows(5);
        jScrollPane12.setViewportView(areaPantallaMPa);

        bordePantallaMPa.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, 170));

        fondoMPa.add(bordePantallaMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 450, 230));

        fieldPalabraMPa.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        fieldPalabraMPa.setForeground(new Color(83, 119, 143));
        fieldPalabraMPa.setBorder(BorderFactory.createEtchedBorder());
        fondoMPa.add(fieldPalabraMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 300, 40));

        fieldDef1MPa.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        fieldDef1MPa.setForeground(new Color(83, 119, 143));
        fieldDef1MPa.setBorder(BorderFactory.createEtchedBorder());
        fondoMPa.add(fieldDef1MPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 300, 90));

        fieldDef2MPa.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        fieldDef2MPa.setForeground(new Color(83, 119, 143));
        fieldDef2MPa.setBorder(BorderFactory.createEtchedBorder());
        fondoMPa.add(fieldDef2MPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 300, 70));

        jLabel5.setFont(new Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setForeground(new Color(83, 119, 143));
        jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel5.setText("Definicion 2");
        fondoMPa.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, 40));

        jLabel6.setFont(new Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setForeground(new Color(83, 119, 143));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setText("Palabra");
        fondoMPa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 100, 40));

        jLabel7.setFont(new Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setForeground(new Color(83, 119, 143));
        jLabel7.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel7.setText("Definicion 1");
        fondoMPa.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, 50));

        crearPalabraMPa.setBackground(new Color(83, 119, 143));
        crearPalabraMPa.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        crearPalabraMPa.setForeground(Color.white);
        crearPalabraMPa.setText("Crear Palabra");
        crearPalabraMPa.setFocusable(false);
        crearPalabraMPa.setBorder(null);
        crearPalabraMPa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                crearPalabraMPaActionPerformed(evt);
            }
        });
        fondoMPa.add(crearPalabraMPa, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 140, 40));

        labelCopyrights8.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights8.setForeground(new Color(83, 119, 143));
        labelCopyrights8.setText("©2022 The CSC Company");
        fondoMPa.add(labelCopyrights8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        GroupLayout modificarPalabrasLayout = new GroupLayout(modificarPalabras.getContentPane());
        modificarPalabras.getContentPane().setLayout(modificarPalabrasLayout);
        modificarPalabrasLayout.setHorizontalGroup(
            modificarPalabrasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMPa, GroupLayout.DEFAULT_SIZE, 825, Short.MAX_VALUE)
        );
        modificarPalabrasLayout.setVerticalGroup(
            modificarPalabrasLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoMPa, GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );

        seleccionJuego.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        seleccionJuego.setTitle("Pasapalabra - Modo de Juego");
        seleccionJuego.setBounds(new Rectangle(0, 0, 440, 250));
        seleccionJuego.setMinimumSize(null);
        seleccionJuego.setModal(true);
        seleccionJuego.setSize(new Dimension(465, 470));

        fondoSJ.setBackground(new Color(244, 241, 234));
        fondoSJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new Color(83, 119, 143));
        jLabel1.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new Color(83, 119, 143));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Seleccione el juego");
        fondoSJ.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 50));

        buttonPartidaSJ.setBackground(new Color(83, 119, 143));
        buttonPartidaSJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        buttonPartidaSJ.setForeground(Color.white);
        buttonPartidaSJ.setText("Partida");
        buttonPartidaSJ.setBorder(null);
        buttonPartidaSJ.setEnabled(false);
        buttonPartidaSJ.setFocusable(false);
        buttonPartidaSJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonPartidaSJActionPerformed(evt);
            }
        });
        fondoSJ.add(buttonPartidaSJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, 60));

        buttonEntrenamiento.setBackground(new Color(83, 119, 143));
        buttonEntrenamiento.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        buttonEntrenamiento.setForeground(Color.white);
        buttonEntrenamiento.setText("Entrenamiento");
        buttonEntrenamiento.setBorder(null);
        buttonEntrenamiento.setFocusable(false);
        buttonEntrenamiento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonEntrenamientoActionPerformed(evt);
            }
        });
        fondoSJ.add(buttonEntrenamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 200, 60));

        volverSJ.setBackground(new Color(248, 216, 216));
        volverSJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        volverSJ.setForeground(new Color(83, 119, 143));
        volverSJ.setText("Volver");
        volverSJ.setBorder(null);
        volverSJ.setFocusable(false);
        volverSJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverSJActionPerformed(evt);
            }
        });
        fondoSJ.add(volverSJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 200, 40));

        labelCopyrights9.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights9.setForeground(new Color(83, 119, 143));
        labelCopyrights9.setText("©2022 The CSC Company");
        fondoSJ.add(labelCopyrights9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        GroupLayout seleccionJuegoLayout = new GroupLayout(seleccionJuego.getContentPane());
        seleccionJuego.getContentPane().setLayout(seleccionJuegoLayout);
        seleccionJuegoLayout.setHorizontalGroup(
            seleccionJuegoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoSJ, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );
        seleccionJuegoLayout.setVerticalGroup(
            seleccionJuegoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoSJ, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        introducirJugadores.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        introducirJugadores.setTitle("Pasapalabra - Introduce Jugador");
        introducirJugadores.setBounds(new Rectangle(0, 0, 400, 350));
        introducirJugadores.setMinimumSize(null);
        introducirJugadores.setModal(true);
        introducirJugadores.setResizable(false);
        introducirJugadores.setSize(new Dimension(515, 490));

        fondoIJ.setBackground(new Color(244, 241, 234));
        fondoIJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloIJ.setBackground(new Color(83, 119, 143));
        tituloIJ.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        tituloIJ.setForeground(new Color(83, 119, 143));
        tituloIJ.setHorizontalAlignment(SwingConstants.CENTER);
        tituloIJ.setText("Introduce los jugadores");
        fondoIJ.add(tituloIJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 430, 70));

        IntroducirJugador1IJ.setBackground(new Color(83, 119, 143));
        IntroducirJugador1IJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        IntroducirJugador1IJ.setForeground(Color.white);
        IntroducirJugador1IJ.setText("Jugador1");
        IntroducirJugador1IJ.setBorder(null);
        IntroducirJugador1IJ.setFocusable(false);
        IntroducirJugador1IJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                IntroducirJugador1IJActionPerformed(evt);
            }
        });
        fondoIJ.add(IntroducirJugador1IJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 120, 40));

        labelCopyrights12.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights12.setForeground(new Color(83, 119, 143));
        labelCopyrights12.setText("©2022 The CSC Company");
        fondoIJ.add(labelCopyrights12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        introducirJugador2IJ.setBackground(new Color(83, 119, 143));
        introducirJugador2IJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        introducirJugador2IJ.setForeground(Color.white);
        introducirJugador2IJ.setText("Jugador2");
        introducirJugador2IJ.setBorder(null);
        introducirJugador2IJ.setFocusable(false);
        introducirJugador2IJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                introducirJugador2IJActionPerformed(evt);
            }
        });
        fondoIJ.add(introducirJugador2IJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, 40));

        buttonVolverIJ.setBackground(new Color(248, 216, 216));
        buttonVolverIJ.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        buttonVolverIJ.setForeground(new Color(83, 119, 143));
        buttonVolverIJ.setText("Volver");
        buttonVolverIJ.setBorder(null);
        buttonVolverIJ.setFocusable(false);
        buttonVolverIJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonVolverIJActionPerformed(evt);
            }
        });
        fondoIJ.add(buttonVolverIJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 110, 40));

        nordeNombreIJ.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white), "Nombre", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe Print", 1, 12), new Color(83, 119, 143))); // NOI18N
        nordeNombreIJ.setOpaque(false);
        nordeNombreIJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldNombreIJ.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        fieldNombreIJ.setForeground(new Color(83, 119, 143));
        fieldNombreIJ.setBorder(BorderFactory.createEtchedBorder());
        nordeNombreIJ.add(fieldNombreIJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 50));

        fondoIJ.add(nordeNombreIJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 190, 100));
        nordeNombreIJ.getAccessibleContext().setAccessibleName("");

        areaInfoIJ.setEditable(false);
        areaInfoIJ.setColumns(20);
        areaInfoIJ.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaInfoIJ.setForeground(new Color(83, 119, 143));
        areaInfoIJ.setRows(5);
        areaInfoIJ.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        jScrollPane2.setViewportView(areaInfoIJ);

        fondoIJ.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 390, 100));

        bordeContraseñaIJ.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Contraseña:", TitledBorder.LEFT, TitledBorder.TOP, new Font("Segoe Print", 0, 12), new Color(83, 119, 143))); // NOI18N
        bordeContraseñaIJ.setOpaque(false);
        bordeContraseñaIJ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldContraseñaIJ.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        fieldContraseñaIJ.setForeground(new Color(83, 119, 143));
        fieldContraseñaIJ.setBorder(BorderFactory.createEtchedBorder());
        bordeContraseñaIJ.add(fieldContraseñaIJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 50));

        fondoIJ.add(bordeContraseñaIJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 190, 100));

        GroupLayout introducirJugadoresLayout = new GroupLayout(introducirJugadores.getContentPane());
        introducirJugadores.getContentPane().setLayout(introducirJugadoresLayout);
        introducirJugadoresLayout.setHorizontalGroup(
            introducirJugadoresLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoIJ, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        introducirJugadoresLayout.setVerticalGroup(
            introducirJugadoresLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(introducirJugadoresLayout.createSequentialGroup()
                .addComponent(fondoIJ, GroupLayout.PREFERRED_SIZE, 479, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ventanaUsuario.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        ventanaUsuario.setTitle("Pasapalabra - Pantalla Principal");
        ventanaUsuario.setBounds(new Rectangle(0, 0, 620, 450));
        ventanaUsuario.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        ventanaUsuario.setMinimumSize(null);
        ventanaUsuario.setResizable(false);
        ventanaUsuario.setSize(new Dimension(940, 700));

        fondoVU.setBackground(new Color(244, 241, 234));
        fondoVU.setForeground(new Color(83, 119, 143));
        fondoVU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloVU.setEditable(false);
        tituloVU.setBackground(new Color(83, 119, 143));
        tituloVU.setFont(new Font("Segoe Print", 1, 36)); // NOI18N
        tituloVU.setForeground(Color.white);
        tituloVU.setHorizontalAlignment(JTextField.CENTER);
        tituloVU.setText("Pasapalabra");
        tituloVU.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Segoe Print", 0, 12), new Color(83, 119, 143))); // NOI18N
        fondoVU.add(tituloVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 830, 60));

        contornoVU.setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(255, 255, 255)), "Modo Usuario", TitledBorder.LEFT, TitledBorder.BOTTOM, new Font("Segoe Print", 1, 11), new Color(83, 119, 143))); // NOI18N
        contornoVU.setOpaque(false);
        contornoVU.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane14.setBackground(new Color(244, 241, 234));
        jScrollPane14.setForeground(new Color(83, 119, 143));

        areaVU.setEditable(false);
        areaVU.setColumns(20);
        areaVU.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        areaVU.setForeground(new Color(83, 119, 143));
        areaVU.setRows(5);
        jScrollPane14.setViewportView(areaVU);

        GroupLayout fondoAreaVP2Layout = new GroupLayout(fondoAreaVP2);
        fondoAreaVP2.setLayout(fondoAreaVP2Layout);
        fondoAreaVP2Layout.setHorizontalGroup(
            fondoAreaVP2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );
        fondoAreaVP2Layout.setVerticalGroup(
            fondoAreaVP2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane14, GroupLayout.Alignment.TRAILING)
        );

        contornoVU.add(fondoAreaVP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 260));

        fondoVU.add(contornoVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 360, 290));

        cerrarVU.setBackground(new Color(255, 102, 102));
        cerrarVU.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        cerrarVU.setForeground(Color.white);
        cerrarVU.setText("Salir");
        cerrarVU.setBorder(null);
        cerrarVU.setFocusable(false);
        cerrarVU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cerrarVUActionPerformed(evt);
            }
        });
        fondoVU.add(cerrarVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, 120, 50));

        jugarVU.setBackground(new Color(83, 119, 143));
        jugarVU.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        jugarVU.setForeground(Color.white);
        jugarVU.setText("Jugar");
        jugarVU.setBorder(null);
        jugarVU.setEnabled(false);
        jugarVU.setFocusable(false);
        jugarVU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jugarVUActionPerformed(evt);
            }
        });
        fondoVU.add(jugarVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 290, 50));

        cargarJugadoresVU.setBackground(new Color(83, 119, 143));
        cargarJugadoresVU.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        cargarJugadoresVU.setForeground(Color.white);
        cargarJugadoresVU.setText("Cargar Jugadores");
        cargarJugadoresVU.setBorder(null);
        cargarJugadoresVU.setFocusable(false);
        cargarJugadoresVU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cargarJugadoresVUActionPerformed(evt);
            }
        });
        fondoVU.add(cargarJugadoresVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, 50));

        infoJugadorVU.setBackground(new Color(83, 119, 143));
        infoJugadorVU.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        infoJugadorVU.setForeground(Color.white);
        infoJugadorVU.setText("Ver Info Jugador");
        infoJugadorVU.setBorder(null);
        infoJugadorVU.setEnabled(false);
        infoJugadorVU.setFocusable(false);
        infoJugadorVU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                infoJugadorVUActionPerformed(evt);
            }
        });
        fondoVU.add(infoJugadorVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, 50));

        adminVU.setBackground(new Color(83, 119, 143));
        adminVU.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        adminVU.setForeground(Color.white);
        adminVU.setText("Entrar como Admin");
        adminVU.setBorder(null);
        adminVU.setFocusable(false);
        adminVU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                adminVUActionPerformed(evt);
            }
        });
        fondoVU.add(adminVU, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 160, 50));

        marcadorJugadorVU2.setBackground(new Color(255, 51, 51));
        marcadorJugadorVU2.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        marcadorJugadorVU2.setOpaque(true);
        fondoVU.add(marcadorJugadorVU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 10, 10));

        marcadorJugadorVU1.setBackground(new Color(255, 51, 51));
        marcadorJugadorVU1.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        marcadorJugadorVU1.setOpaque(true);
        fondoVU.add(marcadorJugadorVU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 10, 10));

        tituloJugadorVU1.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        tituloJugadorVU1.setForeground(new Color(83, 119, 143));
        tituloJugadorVU1.setHorizontalAlignment(SwingConstants.CENTER);
        tituloJugadorVU1.setText("Jugador 1");
        fondoVU.add(tituloJugadorVU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 100, 30));

        tituloJugadorVU2.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        tituloJugadorVU2.setForeground(new Color(83, 119, 143));
        tituloJugadorVU2.setHorizontalAlignment(SwingConstants.CENTER);
        tituloJugadorVU2.setText("Jugador 2");
        fondoVU.add(tituloJugadorVU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 80, 30));

        labelCopyrights2.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights2.setForeground(new Color(83, 119, 143));
        labelCopyrights2.setText("©2022 The CSC Company");
        fondoVU.add(labelCopyrights2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, -1, -1));
        fondoVU.add(labelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 440, 350));

        GroupLayout ventanaUsuarioLayout = new GroupLayout(ventanaUsuario.getContentPane());
        ventanaUsuario.getContentPane().setLayout(ventanaUsuarioLayout);
        ventanaUsuarioLayout.setHorizontalGroup(
            ventanaUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoVU, GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );
        ventanaUsuarioLayout.setVerticalGroup(
            ventanaUsuarioLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(fondoVU, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ventanaTerminos.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        ventanaTerminos.setTitle("Pasapalabra - Licencia de Uso");
        ventanaTerminos.setBounds(new Rectangle(0, 0, 760, 440));
        ventanaTerminos.setMinimumSize(null);
        ventanaTerminos.setModal(true);
        ventanaTerminos.setResizable(false);
        ventanaTerminos.setSize(new Dimension(760, 440));

        jPanel4.setBackground(new Color(244, 241, 234));
        jPanel4.setForeground(new Color(83, 119, 143));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo.setFont(new Font("Segoe Print", 1, 18)); // NOI18N
        labelTitulo.setForeground(new Color(83, 119, 143));
        labelTitulo.setText("TERMINOS Y CONDICIONES");
        jPanel4.add(labelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        checkbox1.setBackground(new Color(244, 241, 234));
        checkbox1.setFont(new Font("Segoe Print", 1, 14)); // NOI18N
        checkbox1.setForeground(new Color(83, 119, 143));
        checkbox1.setText("Acepto");
        checkbox1.setFocusable(false);
        checkbox1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                checkbox1StateChanged(evt);
            }
        });
        jPanel4.add(checkbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        botonNO.setBackground(new Color(83, 119, 143));
        botonNO.setFont(new Font("Segoe Print", 0, 16)); // NOI18N
        botonNO.setForeground(new Color(244, 241, 234));
        botonNO.setFocusable(false);
        botonNO.setText("No Acepto");
        botonNO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonNOActionPerformed(evt);
            }
        });
        jPanel4.add(botonNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 160, 40));

        botonContinuar1.setBackground(new Color(83, 119, 143));
        botonContinuar1.setFont(new Font("Segoe Print", 0, 16)); // NOI18N
        botonContinuar1.setForeground(new Color(244, 241, 234));
        botonContinuar1.setText("Continuar");
        botonContinuar1.setFocusable(false);
        botonContinuar1.setEnabled(false);
        botonContinuar1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonContinuar1ActionPerformed(evt);
            }
        });
        jPanel4.add(botonContinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 160, 40));

        jLabel15.setBackground(new Color(244, 241, 234));
        jLabel15.setFont(new Font("Forte", 0, 44)); // NOI18N
        jLabel15.setForeground(Color.darkGray);
        jLabel15.setText("PASAPALABRA");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 310, 80));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("        TERMINOS Y CONDICIONES\n\n         A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACION DE CRISTIAN LAURENTIU SINDILA.\n         B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS.\n         C.  CRISTIAN LAURENTIU SINDILA, CARLOS DOMINGUEZ MARTINEZ & SEBASTIAN RAMIRO ENTRERRIOS GARCÍA\n              NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE.\n\n         LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE \n         SOFTWARE. LOS CREADORES, NO SE RESPONSABILIZAN DEL USO QUE USTED HAGA CON ESTE SOFTWARE \n         Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO).  SI USTED NO ACEPTA ESTOS\n         TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE.\n\n         -- IMPORTANTE !!  -- SI VALORA POSITIVAMENTE EL TRABAJO REALIZADO ESTA OBLIGADO A CORRESPONDER \n         CON BUENA NOTA ESTE MISMO\n\n         PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE\n                Pagina WEB AQUI\n");
        jScrollPane13.setViewportView(jTextArea2);

        jPanel4.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 700, 200));

        labelCopyrights1.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights1.setForeground(new Color(83, 119, 143));
        labelCopyrights1.setText("©2022 The CSC Company");
        jPanel4.add(labelCopyrights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 40));

        GroupLayout ventanaTerminosLayout = new GroupLayout(ventanaTerminos.getContentPane());
        ventanaTerminos.getContentPane().setLayout(ventanaTerminosLayout);
        ventanaTerminosLayout.setHorizontalGroup(
            ventanaTerminosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
        );
        ventanaTerminosLayout.setVerticalGroup(
            ventanaTerminosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
        );

        cargarDatos.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        cargarDatos.setTitle("Pasapalabra - Cargar Datos");
        cargarDatos.setBounds(new Rectangle(0, 0, 420, 205));
        cargarDatos.setMinimumSize(null);
        cargarDatos.setModal(true);
        cargarDatos.setResizable(false);
        cargarDatos.setSize(new Dimension(440, 260));

        jPanel5.setBackground(new Color(244, 241, 234));
        jPanel5.setPreferredSize(new Dimension(370, 230));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioJugadoresCD.setBackground(new Color(244, 241, 234));
        buttonGroup1.add(radioJugadoresCD);
        radioJugadoresCD.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        radioJugadoresCD.setForeground(new Color(83, 119, 143));
        radioJugadoresCD.setSelected(true);
        radioJugadoresCD.setText("Jugadores");
        radioJugadoresCD.setBorder(null);
        jPanel5.add(radioJugadoresCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        radioPalabrasCD.setBackground(new Color(244, 241, 234));
        buttonGroup1.add(radioPalabrasCD);
        radioPalabrasCD.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        radioPalabrasCD.setForeground(new Color(83, 119, 143));
        radioPalabrasCD.setText("Palabras");
        radioPalabrasCD.setBorder(null);
        jPanel5.add(radioPalabrasCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        volverCD.setBackground(new Color(248, 216, 216));
        volverCD.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        volverCD.setForeground(new Color(83, 119, 143));
        volverCD.setText("Volver");
        volverCD.setFocusable(false);
        volverCD.setBorder(null);
        volverCD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverCDActionPerformed(evt);
            }
        });
        jPanel5.add(volverCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 30));

        archivoCD.setBackground(new Color(83, 119, 143));
        archivoCD.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        archivoCD.setForeground(Color.white);
        archivoCD.setText("Archivo");
        archivoCD.setFocusable(false);
        archivoCD.setBorder(null);
        archivoCD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                archivoCDActionPerformed(evt);
            }
        });
        jPanel5.add(archivoCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 30));

        jLabel16.setBackground(new Color(83, 119, 143));
        jLabel16.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel16.setText("Cargar Datos");
        jLabel16.setOpaque(true);
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 220, 40));

        escribirClasificacionCD.setBackground(new Color(83, 119, 143));
        escribirClasificacionCD.setFont(new Font("Segoe Print", 1, 12)); // NOI18N
        escribirClasificacionCD.setForeground(Color.white);
        escribirClasificacionCD.setText("Escribir Clasificación en TXT");
        escribirClasificacionCD.setFocusable(false);
        escribirClasificacionCD.setBorder(null);
        escribirClasificacionCD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                escribirClasificacionCDActionPerformed(evt);
            }
        });
        jPanel5.add(escribirClasificacionCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 220, 30));

        labelCopyrights6.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights6.setForeground(new Color(83, 119, 143));
        labelCopyrights6.setText("©2022 The CSC Company");
        jPanel5.add(labelCopyrights6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        GroupLayout cargarDatosLayout = new GroupLayout(cargarDatos.getContentPane());
        cargarDatos.getContentPane().setLayout(cargarDatosLayout);
        cargarDatosLayout.setHorizontalGroup(
            cargarDatosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cargarDatosLayout.setVerticalGroup(
            cargarDatosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pasapalabra - Inicio");
        setBounds(new Rectangle(0, 0, 600, 400));
        setResizable(false);
        setSize(new Dimension(600, 400));

        jPanel1.setBackground(new Color(244, 241, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCopyrights.setFont(new Font("Segoe Print", 0, 12)); // NOI18N
        labelCopyrights.setForeground(new Color(83, 119, 143));
        labelCopyrights.setText("©2022 The CSC Company");
        jPanel1.add(labelCopyrights, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        labelLogo.setFont(new Font("Forte", 0, 48)); // NOI18N
        labelLogo.setForeground(new Color(83, 119, 143));
        labelLogo.setHorizontalAlignment(SwingConstants.CENTER);
        labelLogo.setText("PASAPALABRA");
        labelLogo.setVerticalAlignment(SwingConstants.TOP);
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        botonInicio.setBackground(new Color(83, 119, 143));
        botonInicio.setFont(new Font("Segoe Print", 0, 20)); // NOI18N
        botonInicio.setForeground(Color.white);
        botonInicio.setText(" Inicio ");
        botonInicio.setFocusable(false);
        botonInicio.setBorder(botonContinuar1.getBorder());
        botonInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        jPanel1.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
    }
    private void initFrame(){
        pack();
        this.setLocationRelativeTo(null);
        ventanaAdmin.setLocationRelativeTo(this);
        ventanaUsuario.setLocationRelativeTo(this);
        comprobarContraseña.setLocationRelativeTo(this);
        modificarJugadores.setLocationRelativeTo(this);
        modificarJugador.setLocationRelativeTo(this);
        modificarPartidas.setLocationRelativeTo(this);
        modificarPalabras.setLocationRelativeTo(this);
        introducirJugadores.setLocationRelativeTo(this);
        crearJugador.setLocationRelativeTo(this);
        seleccionJuego.setLocationRelativeTo(this);
        ventanaTerminos.setLocationRelativeTo(this);
        cargarDatos.setLocationRelativeTo(this);
        this.setIconImage(image.getImage());
        ventanaUsuario.setIconImage(image.getImage());
        ventanaAdmin.setIconImage(image.getImage());
        comprobarContraseña.setIconImage(image.getImage());
        modificarJugadores.setIconImage(image.getImage());
        modificarJugador.setIconImage(image.getImage());
        modificarPartidas.setIconImage(image.getImage());
        modificarPalabras.setIconImage(image.getImage());
        introducirJugadores.setIconImage(image.getImage());
        crearJugador.setIconImage(image.getImage());
        seleccionJuego.setIconImage(image.getImage());
        ventanaTerminos.setIconImage(image.getImage());
        cargarDatos.setIconImage(image.getImage());
    }
    //End of inits.

    //Buttons functions:
    private void cerrarVAActionPerformed(ActionEvent evt) {
        if (JOptionPane.showConfirmDialog(ventanaAdmin, "Estas a punto de salir sin guardar. Estas seguro de continuar ?", "Mensaje de advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    private void volverUsuarioVAActionPerformed(ActionEvent evt) {
        ventanaAdmin.setVisible(false);
        dialogActual = ventanaUsuario;
        ventanaUsuario.setVisible(true);
        fieldContraseñaCC.setText("");
    }
    
    private void buttonIntroducirCCActionPerformed(ActionEvent evt) {
        String password = fieldContraseñaCC.getText();
        if (Administrador.ADMIN_PASSWORD.equals(password)) {
            comprobarContraseña.setVisible(false);
            ventanaAdmin.setVisible(true);
            ventanaAdmin.setAlwaysOnTop(true);
            dialogActual = ventanaAdmin;
            ImageIcon imageAdmin = new ImageIcon("src\\main\\java\\Imagenes\\fotoAdmin2.png");
            Icon icono2 = new ImageIcon(imageAdmin.getImage().getScaledInstance(labelFotoAdmin.getWidth(), labelFotoAdmin.getHeight(), Image.SCALE_DEFAULT));
            labelFotoAdmin.setIcon(icono2);
            this.repaint();
        } else {
            fieldContraseñaCC.setText("Contraseña incorrecta");
        }
    }

    private void buttonCancelarCCActionPerformed(ActionEvent evt) {
        comprobarContraseña.setVisible(false);
        ventanaUsuario.setVisible(true);
    }

    private void IntroducirJugador1IJActionPerformed(ActionEvent evt) {
        String nombre = fieldNombreIJ.getText();
        String clave = fieldContraseñaIJ.getText();
        Jugador temp;
        if (aJugadores.existeJugador(nombre)) {
            temp = aJugadores.recuperarJugador(nombre);
            if(temp.getClave().equals(clave)){
                if (!(temp.equals(jugador2)) && (temp != null)) {
                    jugador1 = temp;
                    areaInfoIJ.setText("Carga completa del jugador1 con nombre " + nombre);
                    marcadorJugadorVU1.setBackground(Color.GREEN);
                    jugarVU.setEnabled(true);
                    infoJugadorVU.setEnabled(true);
                } else {
                    areaInfoIJ.setText("Los datos introducidos coinciden con el otro jugador,\npor favor utilize otro jugador.\nO hubo un error de recuperación\nde datos pruebe de nuevo.");
                } 
            }else{
                areaInfoIJ.setText("La contraseña no coincide con el usuario vuelva a intentarlo");
            }
        } else {
            areaInfoIJ.setText("Los datos no coinciden con ningun Jugador, cargado fallido.");
        }
        if (jugador2 != null)
            buttonPartidaSJ.setEnabled(true);
    }

    private void buttonVolverIJActionPerformed(ActionEvent evt) {
        areaInfoIJ.setText("");
        fieldNombreIJ.setText("");
        fieldContraseñaIJ.setText("");
        introducirJugadores.setVisible(false);
        ventanaUsuario.setVisible(true);
    }

    private void introducirJugador2IJActionPerformed(ActionEvent evt) {
        String nombre = fieldNombreIJ.getText();
        String clave = fieldContraseñaIJ.getText();
        Jugador temp = null;
        if (aJugadores.existeJugador(nombre)) {
            temp = aJugadores.recuperarJugador(nombre);
            if(temp.getClave().equals(clave)){
                if (!(temp.equals(jugador1)) && (temp != null)) {
                    jugador2 = temp;
                    areaInfoIJ.setText("Carga completa del jugador2 con nombre " + nombre);
                    marcadorJugadorVU2.setBackground(Color.GREEN);
                    jugarVU.setEnabled(true);
                    infoJugadorVU.setEnabled(true);
                } else {
                    areaInfoIJ.setText("Los datos introducidos coinciden con el otro jugador,\npor favor utilize otro jugador.\nO hubo un error de recuperación\nde datos pruebe de nuevo.");
                }
            }else{
                areaInfoIJ.setText("La contraseña no coincide con el usuario vuelva a intentarlo");
            }
        } else {
            areaInfoIJ.setText("Los datos no coinciden con ningun Jugador, cargado fallido.");
        }
        if (jugador1 != null)
            buttonPartidaSJ.setEnabled(true);
    }

    private void volverSJActionPerformed(ActionEvent evt) {
        seleccionJuego.setVisible(false);
        ventanaUsuario.setVisible(true);
    }

    private void buttonPartidaSJActionPerformed(ActionEvent evt) {
        try {
            // Simplemente llamamos al metodo entrenar del entrenamineto con el jugador actual
            Partida partidaActual = new Partida(Partida.PRECIO_ESTANDAR, Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de letras que tendra el rosco. Rango posible [1-25]")), jugador1, jugador2, aPalabras);
            partidaActual.jugar(ventanaUsuario);
            // Restamos los ptos por juagar partida
            jugador1.setPuntos(jugador1.getPuntos() - Partida.PRECIO_ESTANDAR);
            jugador2.setPuntos(jugador2.getPuntos() - Partida.PRECIO_ESTANDAR);
            //Guardamos la partida en el registro
            aPartidas.añadirPartida(partidaActual);
            aPartidas.grabarFichero(ARCHIVO_APARTIDAS);
            aJugadores.grabarFichero(ARCHIVO_AJUGADORES);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(seleccionJuego, "Ha ocurrido un error al seleccionar el número de letras del rosco:\n" + e.toString(), "Error al introducir letras al rosco", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buttonEntrenamientoActionPerformed(ActionEvent evt) {
        try {
            // Simplemente llamamos al metodo entrenar del entrenamineto con el jugador actual
            Entrenamiento entrenamineto = new Entrenamiento(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de letras que tendra el rosco. Rango posible [1-25]")), Entrenamiento.BENEFICIO_ESTANDAR, aPalabras);
            entrenamineto.entrenar(ventanaUsuario, jugador1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(seleccionJuego, "Ha ocurrido un error al seleccionar el número de letras del rosco:\n" + e.toString(), "Error al introducir letras al rosco", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void modJugadoresVAActionPerformed(ActionEvent evt) {
        ventanaAdmin.setVisible(false);
        String[] data = aJugadores.arrayStringListaJugadores();
        listJugadoresMJ.setListData(data);
        modificarJugadores.setVisible(true);
    }

    private void modPartidasVAActionPerformed(ActionEvent evt) {
        ventanaAdmin.setVisible(false);
        String[] data = aJugadores.arrayStringListaJugadores();
        listJugadoresMP.setListData(data);
        modificarPartidas.setVisible(true);
        
    }

    private void modPalabrasVAActionPerformed(ActionEvent evt) {
        ventanaAdmin.setVisible(false);
        modificarPalabras.setVisible(true);
    }

    private void volverMJActionPerformed(ActionEvent evt) {
        modificarJugadores.setVisible(false);
        ventanaAdmin.setVisible(true);
    }

    private void verInfoMJActionPerformed(ActionEvent evt) {
        String nombre = listJugadoresMJ.getSelectedValue();
        pantallaInfoMJ.setText(aJugadores.recuperarJugador(nombre).mostrarHistorial());
    }

    private void actualizarListaMJActionPerformed(ActionEvent evt) {
        String[] data = aJugadores.arrayStringListaJugadores();
        listJugadoresMJ.setListData(data);
    }

    private void crearJugadorMJActionPerformed(ActionEvent evt) {
        modificarJugadores.setVisible(false);
        checkAdminCJ.setEnabled(true);
        crearJugador.setVisible(true);
    }

    private void clasificacionMJActionPerformed(ActionEvent evt) {
        pantallaInfoMJ.setText(aJugadores.stringClasificacion(true));
    }

    private void modificarJugadorMJActionPerformed(ActionEvent evt) {
        String nombre = listJugadoresMJ.getSelectedValue();
        jModificar = aJugadores.recuperarJugador(nombre);
        areaHistMJu.setText(jModificar.mostrarHistorial());
        fieldNombreMJu.setText(jModificar.getNombre());
        fieldClaveMJu.setText(jModificar.getClave());
        fieldPuntosMJu.setText(jModificar.getPuntos() + "");
        modificarJugadores.setVisible(false);
        modificarJugador.setVisible(true);
    }

    private void borrarJugadorMJActionPerformed(ActionEvent evt) {
        String nombre = listJugadoresMJ.getSelectedValue();
        aJugadores.borrarJugador(aJugadores.recuperarJugador(nombre));
        this.actualizarListaMJActionPerformed(evt);
    }

    private void listaCompletaJugadoresActionPerformed(ActionEvent evt) {
        pantallaInfoMJ.setText(aJugadores.jugadoresInfo());
    }

    private void volverMJuActionPerformed(ActionEvent evt) {
        modificarJugador.setVisible(false);
        modificarJugadores.setVisible(true);
        this.actualizarListaMJActionPerformed(evt);
    }//GEN-LAST:event_volverMJuActionPerformed

    private void actualizarJugadorMJuActionPerformed(ActionEvent evt) {
        try {
            jModificar.setNombre(fieldNombreMJu.getText());
        } catch (EJugadorNoValidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso al actualizar jugador", JOptionPane.WARNING_MESSAGE);
        }
        try {
            jModificar.setClave(fieldClaveMJu.getText());
        } catch (EJugadorNoValidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso al actualizar jugador", JOptionPane.WARNING_MESSAGE);
        }
        try {
            jModificar.setPuntos(Integer.parseInt(fieldPuntosMJu.getText()));
        } catch (EJugadorNoValidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso al actualizar jugador", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void volverCJActionPerformed(ActionEvent evt) {
        crearJugador.setVisible(false);
        dialogActual.setVisible(true);
        fieldNombreCJ.setText("");
        fieldClaveCJ.setText("");
        areaPantallaCJ.setText("");
    }

    private void crearJugadorCJActionPerformed(ActionEvent evt) {
        String nombreTemp = fieldNombreCJ.getText();
        String claveTemp = fieldClaveCJ.getText();
        if(!aJugadores.existeJugador(nombreTemp)){
            if (checkAdminCJ.isSelected()) {
                try {
                    aJugadores.añadirJugador(new Administrador(nombreTemp));
                    areaPantallaCJ.setText("Admin añadido...");
                } catch (EJugadorNoValidoException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso al crear jugador", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                try {
                    aJugadores.añadirJugador(new Jugador(nombreTemp, claveTemp));
                    areaPantallaCJ.setText("Jugador añadido con nombre "+nombreTemp+"...");
                } catch (EJugadorNoValidoException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso al crear jugador", JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            areaPantallaCJ.setText("Ya existe el jugador");
        }
    }

    private void volverMPActionPerformed(ActionEvent evt) {
        modificarPartidas.setVisible(false);
        ventanaAdmin.setVisible(true);
        areaPantallaMP.setText("");
        fieldHoraMP.setText("");
        fieldDiaMP.setText("");
        fieldMesMP.setText("");
        fieldAñoMP.setText("");
        fieldMinutoMP.setText("");
    }

    private void verPartidasJugadorActionPerformed(ActionEvent evt) {
        String[] datos = aJugadores.recuperarJugador(listJugadoresMP.getSelectedValue()).devolverPartidasFechas();
        listPartidasMP.setListData(datos);
    }

    private void infoPartidaMPActionPerformed(ActionEvent evt) {
        areaPantallaMP.setText(aPartidas.recuperarPartida(listPartidasMP.getSelectedValue()).toString());
    }

    private void partidasGlobalesMPActionPerformed(ActionEvent evt) {
        areaPantallaMP.setText(aPartidas.toString());
    }

    private void alterarPartidaMPActionPerformed(ActionEvent evt) {
        LocalDateTime fechaNueva = LocalDateTime.of(Integer.parseInt(fieldAñoMP.getText()), Integer.parseInt(fieldMesMP.getText()), Integer.parseInt(fieldDiaMP.getText()), Integer.parseInt(fieldHoraMP.getText()), Integer.parseInt(fieldMinutoMP.getText()));
        aPartidas.recuperarPartida(listPartidasMP.getSelectedValue()).setFecha(fechaNueva);
        aJugadores.recuperarJugador(listJugadoresMP.getSelectedValue()).devolverPartidaPorStringFecha(listPartidasMP.getSelectedValue()).setFecha(fechaNueva);
        verPartidasJugadorActionPerformed(evt);
    }

    private void volverMPaActionPerformed(ActionEvent evt) {
        modificarPalabras.setVisible(false);
        ventanaAdmin.setVisible(true);
        fieldPalabraMPa.setText("");
        fieldDef1MPa.setText("");
        fieldDef2MPa.setText("");
        areaPantallaMPa.setText("");
    }

    private void verlistasMPaActionPerformed(ActionEvent evt) {
        String[] datos = aPalabras.arrayStringListaPalabras(listLetrasMPa.getSelectedValue().charAt(6));
        listPalabrasMPa.setListData(datos);
    }

    private void verPalabraMPaActionPerformed(ActionEvent evt) {
        areaPantallaMPa.setText(aPalabras.recuperarPorNombre(listPalabrasMPa.getSelectedValue()).toString());
    }

    private void borrarPalabraMPaActionPerformed(ActionEvent evt) {
        aPalabras.borrarPalabra(aPalabras.recuperarPorNombre(listPalabrasMPa.getSelectedValue()));
        areaPantallaMPa.setText("Palabra Borrada...");
        verlistasMPaActionPerformed(evt);
    }

    private void verPalabrasMPaActionPerformed(ActionEvent evt) {
        areaPantallaMPa.setText(aPalabras.stringAlmacenPalabras());
    }

    private void modificarPalabraMPaActionPerformed(ActionEvent evt) {
        String palabra = fieldPalabraMPa.getText();
        String def1 = fieldDef1MPa.getText();
        String def2 = fieldDef2MPa.getText();
        Palabra p = aPalabras.recuperarPorNombre(listPalabrasMPa.getSelectedValue());
        if (!("".equals(palabra) || "".equals(def1))) {
            p.setPalabra(new StringBuilder(palabra));
            p.setDef1(new Definicion(def1));
            p.setDef2(new Definicion(def2));
            areaPantallaMPa.setText("Palabra Modificada...");
        } else {
            areaPantallaMPa.setText("Palabra o Def1 estan vacíos...");
            fieldPalabraMPa.setText(p.getPalabra().toString());
            fieldDef1MPa.setText(p.getDef1().getDefinicion());
            fieldDef2MPa.setText(p.getDef2().getDefinicion());
        }
        verlistasMPaActionPerformed(evt);
    }

    private void crearPalabraMPaActionPerformed(ActionEvent evt) {
        String palabra = fieldPalabraMPa.getText();
        String def1 = fieldDef1MPa.getText();
        String def2 = fieldDef2MPa.getText();
        if(!aPalabras.existePalabra(palabra)){
            if (!("".equals(palabra) || "".equals(def1))) {
                try {
                    aPalabras.añadirPalabra(new Palabra(palabra.charAt(0), palabra, new Definicion(def1), new Definicion(def2)));
                } catch (EPalabraNoValidaException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Aviso al crear palabra", JOptionPane.WARNING_MESSAGE);
                }
                areaPantallaMPa.setText("Palabra "+palabra+" añadida...");
            } else {
                areaPantallaMPa.setText("Palabra o Def1 estan vacíos...");
            }
        }else{
            areaPantallaMPa.setText("Palabra "+palabra+" ya existe...");
        }
        verlistasMPaActionPerformed(evt);
    }

    private void cerrarVUActionPerformed(ActionEvent evt) {
        try {
            aJugadores.grabarFichero(ARCHIVO_AJUGADORES);
            aPartidas.grabarFichero(ARCHIVO_APARTIDAS);
            aPalabras.grabarFichero(ARCHIVO_APALABRAS);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido grabar los datos correctamente", "Aviso al grabar", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            //Cualquier otro error lo comunicamos y salimos
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al grabar la informacion necesaria para jugar, por favor, vuelva a intentarlo. Informe del error:\n" + e.toString(), "Error al grabar", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }

    private void jugarVUActionPerformed(ActionEvent evt) {
        ventanaUsuario.setVisible(false);
        seleccionJuego.setVisible(true);
    }

    private void cargarJugadoresVUActionPerformed(ActionEvent evt) {
        ventanaUsuario.setVisible(false);
        introducirJugadores.setVisible(true);
    }

    private void infoJugadorVUActionPerformed(ActionEvent evt) {
        StringBuilder sb = new StringBuilder("");
        if (jugador1 != null) {
            sb.append("Jugador 1:\n" + jugador1.mostrarHistorial() + "Fin Jugador 1.\n");
        }
        if (jugador2 != null) {
            sb.append("Jugador 2:\n" + jugador2.mostrarHistorial() + "Fin Jugador 2.");
        }
        areaVU.setText(sb.toString());
    }

    private void adminVUActionPerformed(ActionEvent evt) {
        ventanaUsuario.setVisible(false);
        comprobarContraseña.setVisible(true);
    }

    private void botonInicioActionPerformed(ActionEvent evt) {
        this.setVisible(false);
        ventanaTerminos.setVisible(true);
        dialogActual = ventanaTerminos;
        this.setState(this.ICONIFIED);
        this.setDefaultCloseOperation(0);
        this.botonInicio.setEnabled(false);
        try {
            aPalabras.cargarFichero(ARCHIVO_APALABRAS);
        } catch (FileNotFoundException e) {
            //Si no se encuentran es que aun no existen, los creamos
            JOptionPane.showMessageDialog(ventanaUsuario, "Actualmente no hay informacion cargada, el administrador debera revisar los datos cargados para que se pueda jugar correctamente", "Aviso al cargar", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            //Cualquier otro error lo comunicamos y salimos
            JOptionPane.showMessageDialog(ventanaUsuario, "Ha ocurrido un error al cargar la informacion necesaria para jugar, por favor, vuelva a intentarlo. Informe del error:\n" + e.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            aPartidas.cargarFichero(ARCHIVO_APARTIDAS);
        } catch (FileNotFoundException e) {
            //Si no se encuentran no pasa nada, puede no haber partidas todavia
        } catch (Exception e) {
            //Cualquier otro error lo comunicamos y salimos
            JOptionPane.showMessageDialog(ventanaUsuario, "Ha ocurrido un error al cargar la informacion necesaria para jugar, por favor, vuelva a intentarlo. Informe del error:\n" + e.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            //Si esta vacia, no habra administrador y habra que crearlo
            aJugadores.cargarFichero(ARCHIVO_AJUGADORES);
        } catch (FileNotFoundException e) {
            try {
                //Si no se encuentran es que aun no existen, los creamos
                JOptionPane.showMessageDialog(ventanaUsuario, "Actualmente no existe administrador, se creara el administrador por defecto", "Aviso al cargar", JOptionPane.WARNING_MESSAGE);
                //Ademas lo cargamos en el almacen
                aJugadores.añadirJugador(new Administrador("Admin"));
                //Y guardamos la informacion en disco
                aJugadores.grabarFichero(ARCHIVO_AJUGADORES);
            } catch (EJugadorNoValidoException ex) {
                JOptionPane.showMessageDialog(ventanaUsuario, "Ha ocurrido un error al cargar la informacion del administrador por defecto necesaria para jugar, por favor, vuelva a intentarlo. Informe del error:\n" + ex.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            } catch (IOException ex) {
                //Cualquier otro error lo comunicamos y salimos
                JOptionPane.showMessageDialog(ventanaUsuario, "Ha ocurrido un error al cargar la informacion necesaria para jugar, por favor, vuelva a intentarlo. Informe del error:\n" + e.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ventanaUsuario, "Ha ocurrido un error al cargar la informacion necesaria para jugar, por favor, vuelva a intentarlo. Informe del error:\n" + e.toString(), "Error al cargar", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    private void checkbox1StateChanged(ChangeEvent evt) {
        if (checkbox1.isSelected() == true)
            botonContinuar1.setEnabled(true);
        else
            botonContinuar1.setEnabled(false);
    }

    private void botonNOActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void botonContinuar1ActionPerformed(ActionEvent evt) {
        ventanaTerminos.dispose();
        ventanaUsuario.setVisible(true);
        ImageIcon imageRosco = new ImageIcon("data\\img\\fotoRoscoPpal.png");
        Icon iconoF1 = new ImageIcon(imageRosco.getImage().getScaledInstance(labelFoto.getWidth(), labelFoto.getHeight(), Image.SCALE_DEFAULT));
        labelFoto.setIcon(iconoF1);
        this.repaint();
        ventanaUsuario.setAlwaysOnTop(true);
        dialogActual = ventanaUsuario;
    }

    private void volverCDActionPerformed(ActionEvent evt) {
        cargarDatos.setVisible(false);
        ventanaAdmin.setVisible(true);
    }

    private void escribirClasificacionCDActionPerformed(ActionEvent evt) {
        try {
            aJugadores.exportarClasificacionTXT(ARCHIVO_TXT);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido crear el TXT", "Error al escribir el TXT", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void archivoCDActionPerformed(ActionEvent evt) {
        if (radioJugadoresCD.isSelected()) {
            JFileChooser dialog = new JFileChooser();
            int response = dialog.showOpenDialog(null);
            //int response = dialog.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                String file = dialog.getSelectedFile().getAbsolutePath();
                try {
                    aJugadores.cargarFichero(file);
                    JOptionPane.showMessageDialog(null, "Se ha completado la carga del archivo!", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar los datos, error: " + ex.getMessage(), "Error al cargar jugadores", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar los datos, error: " + ex.getMessage(), "Error al cargar jugadores", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (radioPalabrasCD.isSelected()) {
            JFileChooser dialog = new JFileChooser();
            int response = dialog.showOpenDialog(null);
            //int response = dialog.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                String file = dialog.getSelectedFile().getAbsolutePath();
                try {
                    aPalabras.cargarFichero(file);
                    JOptionPane.showMessageDialog(null, "Se ha completado la carga del archivo!", "Exito", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar los datos, error: " + ex.getMessage(), "Error al cargar jugadores", JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "No se ha podido cargar los datos, error: " + ex.getMessage(), "Error al cargar jugadores", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado el almacen a sustituir", "Error al cargar datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarDatosVAActionPerformed(ActionEvent evt) {
        ventanaAdmin.setVisible(false);
        cargarDatos.setVisible(true);
    }

    private void guardarDatosVAActionPerformed(ActionEvent evt) {
        StringBuilder sb = new StringBuilder("");
        try {
            aJugadores.grabarFichero(ARCHIVO_AJUGADORES);
            sb.append("Jugadores guadados con exito!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se ha guardado los datos de los Jugadores", "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
        }
        try {
            aPartidas.grabarFichero(ARCHIVO_APARTIDAS);
            sb.append("\nPartidas guadadas con exito!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se ha guardado los datos de las Partidas", "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
        }
        try {
            aPalabras.grabarFichero(ARCHIVO_APALABRAS);
            sb.append("\nPalabras guadadas con exito!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se ha guardado los datos de las Palabras", "Error al guardar datos", JOptionPane.ERROR_MESSAGE);
        }
        areaPantallaVA.setText(sb.toString());

    }

    private void borrarPartidaActionPerformed(ActionEvent evt) {
        StringBuilder sb = new StringBuilder("Resumen borrado:\n");
        Partida partidaABorrar = aPartidas.recuperarPartida(listPartidasMP.getSelectedValue());
        Jugador j1 = aJugadores.recuperarJugador(partidaABorrar.getJugador1().getNombre());
        Jugador j2 = aJugadores.recuperarJugador(partidaABorrar.getJugador2().getNombre());
        if(aPartidas.borrarPartida(partidaABorrar)){
            sb.append("(1/3)Borrado de almacen exitoso.\n");
            if(j1.borrarPartida(partidaABorrar)){
                sb.append("(2/3)Borrado del primer jugador exitoso.\n");
                if(j2.borrarPartida(partidaABorrar)){
                    sb.append("(3/3)Borrado del segundo jugador exitoso.\n");
                }else{
                    sb.append("Borrado abortado, error al borrar del segundo jugador.\n");
                    aPartidas.añadirPartida(partidaABorrar);
                    j1.añadirPartida(partidaABorrar);
                }
            }else{
                sb.append("Borrado abortado, error al borrar del primer jugador.\n");
                aPartidas.añadirPartida(partidaABorrar);
            }
        }else sb.append("Borrado abortado, error al borrar en almacen.\n");
        areaPantallaMP.setText(sb.toString());
        verPartidasJugadorActionPerformed(evt);
    }
    //End of Button functions.

    //Components:
    private JDialog ventanaAdmin,ventanaTerminos,ventanaUsuario;
    private JDialog cargarDatos;
    private JDialog comprobarContraseña;
    private JDialog crearJugador;
    private JDialog introducirJugadores;
    private JDialog modificarJugador,modificarJugadores,modificarPalabras,modificarPartidas,seleccionJuego;
    private JLabel jLabel1,jLabel15,jLabel16,jLabel2,jLabel3,marcadorJugadorVU1,marcadorJugadorVU2;
    private JLabel jLabel4,jLabel5,jLabel6,jLabel7,labelCopyrights1,labelCopyrights10;
    private JLabel labelCopyrights,labelCopyrights11,labelCopyrights12,labelCopyrights2;
    private JLabel labelCopyrights3,labelCopyrights4,labelCopyrights5,labelCopyrights6;
    private JLabel labelCopyrights7,labelCopyrights8,labelCopyrights9,labelFoto,labelFotoAdmin;
    private JLabel labelInfo,labelLogo,labelTitulo,tituloAlterarMP,tituloAlterarMP1,tituloAlterarMP2;
    private JLabel tituloCJ,tituloClaveCJ,tituloClaveMJu,tituloHistMJu,tituloIJ,tituloJugadorVU1;
    private JLabel tituloJugadorVU2,tituloMJ,tituloMPa,tituloNombreCJ,tituloNombreMJu,tituloPuntosMJu;
    private JPanel bordeContraseñaIJ,bordePantallaCJ,bordePantallaMJ,bordePantallaMP,bordePantallaMPa;
    private JPanel fondoAreaVP2,fondoCC,fondoCJ,fondoIJ,fondoMJ,fondoMJu,fondoMP,fondoMPa,fondoSJ,fondoVA,fondoVU;
    private JPanel nordeNombreIJ,marcoContraseñaCC,contornoVA,contornoVU,jPanel4,jPanel5,jPanel6,jPanel1;
    private JScrollPane jScrollPane10,jScrollPane11,jScrollPane12,jScrollPane13,jScrollPane14,jScrollPane15;
    private JScrollPane jScrollPane2,jScrollPane3,jScrollPane4,jScrollPane5,jScrollPane6,jScrollPane7,jScrollPane8,jScrollPane9;
    private JTextField tituloVA,tituloVU,fieldMesMP,fieldMinutoMP,fieldNombreCJ,fieldNombreIJ;
    private JTextField fieldAñoMP,fieldClaveCJ,fieldClaveMJu,fieldContraseñaCC,fieldContraseñaIJ;
    private JTextField fieldNombreMJu,fieldPalabraMPa,fieldPuntosMJu,fieldDef1MPa,fieldDef2MPa,fieldDiaMP,fieldHoraMP;
    private JTextArea jTextArea2,areaPantallaMPa,areaPantallaVA,areaVU;
    private JTextArea pantallaInfoMJ,areaHistMJu,areaInfoIJ,areaPantallaCJ,areaPantallaMP;
    private JButton IntroducirJugador1IJ,actualizarJugadorMJu,actualizarListaMJ,adminVU,modJugadoresVA;
    private JButton buttonIntroducirCC,buttonPartidaSJ,buttonVolverIJ,alterarPartidaMP,archivoCD,escribirClasificacionCD;
    private JButton cargarDatosVA,cargarJugadoresVU,cerrarVA,cerrarVU,clasificacionMJ,modPartidasVA,crearJugadorMJ;
    private JButton guardarDatosVA,infoJugadorVU,infoPartidaMP,introducirJugador2IJ,modPalabrasVA,crearJugadorCJ;
    private JButton listaCompletaJugadores,verInfoMJ,verPalabraMPa,verPalabrasMPa,verPartidasJugador;
    private JButton verlistasMPa,volverCD,volverCJ,volverMJ,volverMJu,volverMP,volverMPa,volverSJ,crearPalabraMPa;
    private JButton volverUsuarioVA,modificarPalabraMPa,modificarJugadorMJ,jugarVU,partidasGlobalesMP;
    private JButton borrarJugadorMJ,borrarPalabraMPa,borrarPartida,botonContinuar1,botonInicio,botonNO,buttonCancelarCC,buttonEntrenamiento;
    private ButtonGroup buttonGroup1;
    private JCheckBox checkAdminCJ,checkbox1;
    private JList<String> listJugadoresMJ,listJugadoresMP,listLetrasMPa,listPalabrasMPa,listPartidasMP;
    private JRadioButton radioJugadoresCD,radioPalabrasCD;
    //End of components
}
