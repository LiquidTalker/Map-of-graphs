package Frame;

import Data.Graphics;
import Data.Edge;
import Data.Graph;
import Data.Helper;
import Data.Vertex;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Frame extends javax.swing.JFrame {

    private ArrayList<Edge> minRoute = new ArrayList<>(); //Lista con la mínima ruta
    private Graph graph; //Grafo 
    private int[][] distance; //Matriz de distancias
    private int[][] route; //Matriz de caminos
    private Vertex origin; //Vertice origen
    private Vertex destiny; //Vertice destino
    private Vertex helperVertex; //Vertice ayudante
    private final Graphics graphics; //Graficos 
    private java.awt.Graphics g; //Graficos por default

    /**
     * Constructor
     */
    public Frame() {
        initComponents();
        graph = new Graph();
        graphics = new Graphics();
        setScreenLocation();
        setTitle();
        setResize(false);
        setFavicon();
        graphics.playMusic();
    }

    /**
     * Evita la expansión de la ventana
     *
     * @param resize
     */
    private void setResize(boolean resize) {
        this.setResizable(resize);
    }

    /**
     * Coloca el icono de la ventana
     */
    private void setFavicon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/Mario Mushroom.png")).getImage());
    }

    /**
     * Coloca el título de la ventana
     */
    private void setTitle() {
        this.setTitle("Mario World Navigator");
    }

    /**
     * Centra la ventana
     */
    private void setScreenLocation() {
        this.setLocationRelativeTo(null);
    }

    /**
     * Pinta el vertice
     *
     * @param g, graphics 2D del mapa
     * @param n, vertice a pintar
     */
    private void paint(Graphics2D g, Vertex n) {
        map2.revalidate();
        graphics.paintVertex(g, n);
    }

    /**
     * Pinta la arista
     *
     * @param g, graphics 2D del mapa
     * @param origin, vertice origen
     * @param destiny, vertice destino
     * @param distance, distancia entre el vertice origen y el vertice destino
     */
    private void paintDistance(Graphics2D g, Vertex origin, Vertex destiny, int distance) {
        map2.revalidate();
        graphics.paintDistance(g, origin, destiny, distance);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        map = new javax.swing.JPanel();
        map2 = new javax.swing.JLabel();
        backGroundPanel = new javax.swing.JPanel();
        originLabel = new javax.swing.JLabel();
        originBox = new javax.swing.JComboBox<>();
        destinyBox = new javax.swing.JComboBox<>();
        destinyLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JButton();
        helpLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        map.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        map.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        map2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mario world.png"))); // NOI18N
        map2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                map2MouseClicked(evt);
            }
        });
        map.add(map2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 390));

        getContentPane().add(map, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 750, 400));

        backGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        backGroundPanel.setForeground(new java.awt.Color(255, 255, 255));
        backGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        originLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        originLabel.setText("Ciudad origen");
        backGroundPanel.add(originLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 20));

        originBox.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        originBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backGroundPanel.add(originBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 140, 30));

        destinyBox.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        destinyBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backGroundPanel.add(destinyBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 150, 30));

        destinyLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        destinyLabel.setText("Ciudad destino");
        backGroundPanel.add(destinyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, 20));

        priceLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        priceLabel.setText("Mínimo Costo");
        backGroundPanel.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, 30));

        price.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Coin Mario.png"))); // NOI18N
        price.setBorder(null);
        price.setContentAreaFilled(false);
        price.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        backGroundPanel.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 50, -1));

        helpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Help-icon.png"))); // NOI18N
        helpLabel.setText("Help");
        helpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpLabelMouseClicked(evt);
            }
        });
        backGroundPanel.add(helpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mario Poison Mushroom.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        backGroundPanel.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("Eliminar");
        backGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 67, -1, 20));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Clouds.png"))); // NOI18N
        backGroundPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        getContentPane().add(backGroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento para cuando se de click izquierdo se cree una vertice y cuando se
     * de click derecho a un vertice origen y luego a un vertice destino se cree
     * una arista
     *
     * @param evt, evento del click
     */
    private void map2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_map2MouseClicked

        try {
            if (evt.getButton() == MouseEvent.BUTTON1) {
                if (graph.vertex.isEmpty()) {
                    helperVertex = graphics.answer(JOptionPane.showInputDialog(null, "Quieres añadir un lugar en esta posiciòn? Sí / No", "Añadir", JOptionPane.QUESTION_MESSAGE), evt.getX(), evt.getY());
                    if (helperVertex != null) {
                        graph.addVertex(helperVertex);
                        addVertexInComboBox();
                        paint((Graphics2D) map2.getGraphics(), graph.vertex.get(Helper.vertexCount));
                        Helper.plusOneVertex();
                    }
                } else {
                    if (graphics.checkVertexPosition(graph.vertex, evt.getX(), evt.getY())) {
                        Helper.errorMessage();
                    } else {
                        helperVertex = graphics.answer(JOptionPane.showInputDialog(null, "Quieres añadir un lugar en esta posiciòn? Sí / No", "Añadir", JOptionPane.QUESTION_MESSAGE), evt.getX(), evt.getY());
                        if (helperVertex != null && graph.checkVertexList(helperVertex) != -1) {
                            graph.vertex.add(helperVertex);
                            addVertexInComboBox();
                            paint((Graphics2D) map2.getGraphics(), graph.vertex.get(Helper.vertexCount));
                            Helper.plusOneVertex();
                        } else {
                            if (graph.checkVertexList(helperVertex) == -1) {
                                Helper.existingVertex();
                            }
                        }
                    }
                }
            } else {
                if (evt.getButton() == MouseEvent.BUTTON3) {
                    if (!Helper.primaryOcuppied) {
                        origin = graphics.originVertex(graph.vertex, evt.getX(), evt.getY());
                    } else {
                        destiny = graphics.destinyVertex(graph.vertex, evt.getX(), evt.getY());
                        Helper.setPrimaryVertex();
                    }
                    if (origin != null && destiny != null && origin != destiny) {
                        graph.edges.add(new Edge(origin, destiny, Helper.introduceDistance()));
                        paintDistance((Graphics2D) map2.getGraphics(), graph.edges.get(Helper.edgeCount).getOriginVertex(), graph.edges.get(Helper.edgeCount).getDestinyVertex(),
                                graph.edges.get(Helper.edgeCount).getDistance());
                        Helper.plusOneEdge();
                        origin = destiny = null;
                    } else {
                        if (origin == destiny) {
                            Helper.errorSameVertex();
                        }
                    }
                }
            }
        } catch (HeadlessException e) {
            Helper.emptyJOptionPane();
        }
    }//GEN-LAST:event_map2MouseClicked

    /**
     * Añade los vertices al comboBox de origen y destino
     */
    private void addVertexInComboBox() {
        originBox.insertItemAt(graph.vertex.get(Helper.vertexCount).getCity(), Helper.vertexCount);
        destinyBox.insertItemAt(graph.vertex.get(Helper.vertexCount).getCity(), Helper.vertexCount);
    }

    /**
     * Evento cuando se de click en la moneda busca el camino mínimo y el costo
     * mínimo
     *
     * @param evt, evento de click
     */
    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed

        try {
            distance = graph.getDistanceMatrix(graph.vertex, graph.edges);
            route = graph.getPathMatrix(graph.vertex);
            graph.floyd(distance, route);
            if (searchOriginVertex() != null && searchDestinyVertex() != null && distance != null) {
                int priceDistance = distance[graph.vertex.indexOf(searchOriginVertex())][graph.vertex.indexOf(searchDestinyVertex())];
                if (priceDistance == Graph.INF) {
                    JOptionPane.showMessageDialog(null, "No puedes ir de " + searchOriginVertex().getCity() + " a " + searchDestinyVertex().getCity(), "Ruta mínima",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "La ruta mínima para ir de: " + originBox.getSelectedItem().toString()
                            + " a " + destinyBox.getSelectedItem().toString() + " cuesta " + priceDistance, "Ruta mínima", JOptionPane.INFORMATION_MESSAGE);
                    minRoute = graph.getMinRoute(searchOriginVertex(), searchDestinyVertex(), route);
                    graphics.paintMinPath((Graphics2D) map2.getGraphics(), minRoute);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona dos ciudades en el combo box y presiona el boton de Floyd Warshall");
            }
        } catch (HeadlessException e) {
            Helper.emptyJOptionPane();
        }

    }//GEN-LAST:event_priceActionPerformed

    /**
     * Busca el vertice origen en el ComboBox
     *
     * @return un vertice si encuentra el item seleccionado o null si no lo
     * encuentra
     */
    private Vertex searchOriginVertex() {
        for (Vertex v : graph.vertex) {
            if (originBox.getSelectedItem().toString().equalsIgnoreCase(v.getCity())) {
                return v;
            }
        }
        return null;
    }

    /**
     * Busca el vertice destino en el ComboBox
     *
     * @return un vertice si encuentra el item seleccionado o null si no lo
     * encuentra
     */
    private Vertex searchDestinyVertex() {
        for (Vertex v : graph.vertex) {
            if (destinyBox.getSelectedItem().toString().equalsIgnoreCase(v.getCity())) {
                return v;
            }
        }
        return null;
    }

    /**
     * Evento para cuando se de click en el label de ayuda se despligue un
     * mensaje de ayuda
     *
     * @param evt, evento de click
     */
    private void helpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpLabelMouseClicked

        Helper.helpMessage();

    }//GEN-LAST:event_helpLabelMouseClicked

    /**
     * Evento para cuando se de click en el hongo venenoso se elimine un vertice
     * y se eliminan las aristas entrantes y salientes del mismo
     *
     * @param evt, evento de click
     */
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        try {
            g = getGraphics();
            String ans = JOptionPane.showInputDialog(null, "¿Cual vertice desea eliminar?", "Eliminar", JOptionPane.QUESTION_MESSAGE);
            if (!ans.isEmpty()) {
                removeFromBoxes(ans);
                graph.deleteEdges(ans);
                graph.deleteVertex(ans);
                Helper.minusOneVertex();
                super.paint(g);
                repaintGraph();
            }
        } catch (HeadlessException e) {
            Helper.emptyJOptionPane();
        }


    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * Repinta el grafo cuando se elimina un vertice
     */
    private void repaintGraph() {
        graph.vertex.forEach((v) -> {
            graphics.paintVertex((Graphics2D) map2.getGraphics(), v);
        });
        if (!graph.edges.isEmpty()) {
            graph.edges.forEach((e) -> {
                graphics.paintDistance((Graphics2D) map2.getGraphics(), e.getOriginVertex(), e.getDestinyVertex(), e.getDistance());
            });
        }
    }

    /**
     * Elimina de los ComboBox el vertice que quiera el usuario
     *
     * @param ans, nombre del vertice a eliminar
     */
    private void removeFromBoxes(String ans) {
        originBox.removeItem(ans);
        destinyBox.removeItem(ans);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backGroundPanel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JComboBox<String> destinyBox;
    private javax.swing.JLabel destinyLabel;
    private javax.swing.JLabel helpLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel map;
    private javax.swing.JLabel map2;
    private javax.swing.JComboBox<String> originBox;
    private javax.swing.JLabel originLabel;
    private javax.swing.JButton price;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables
}
