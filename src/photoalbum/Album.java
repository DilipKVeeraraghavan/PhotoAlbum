package photoalbum;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Album extends javax.swing.JFrame {
    
    Photo[] images = new Photo[10];
    private int Displayingimage;
    Timer slideshow;
    private int x = 0;

    
    public Album() {
        
        initComponents();
        
        stopSlide.setVisible(false);
        jTextArea1.setColumns (30);
        jTextArea1.setLineWrap (true);
        jTextArea1.setWrapStyleWord (true);
        annotation.setColumns (30);
        annotation.setLineWrap (true);
        annotation.setWrapStyleWord (true);
        
        annotationHover.getViewport().setOpaque(false);
        start.setVisible(true);
        uploadPane.setVisible(false);
        displayPane.setVisible(false);   
        aalert.setVisible(false);
        talert.setVisible(false);
        
        DefaultTreeModel model = (DefaultTreeModel) photoTree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        uploadButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        photoCount = new javax.swing.JLabel();
        stopSlide = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        treePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        photoTree = new javax.swing.JTree();
        layer = new javax.swing.JLayeredPane();
        uploadPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        browse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        annotation = new javax.swing.JTextArea();
        cancel = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        talert = new javax.swing.JLabel();
        aalert = new javax.swing.JLabel();
        displayPane = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        displayLayer = new javax.swing.JLayeredPane();
        changePanel = new javax.swing.JPanel();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        outof = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        photoArea = new javax.swing.JLabel();
        titleHover = new javax.swing.JTextField();
        annotationHover = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        start = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        slide = new javax.swing.JPanel();
        slideLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        uploadButton.setText("Upload  Photo");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Start SlideShow");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("No of Photos in album :");

        photoCount.setText("0");

        stopSlide.setText("Stop SlideShow");
        stopSlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSlideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uploadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stopSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photoCount)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(uploadButton)
                .addComponent(jButton3)
                .addComponent(jLabel1)
                .addComponent(photoCount)
                .addComponent(stopSlide))
        );

        jSplitPane1.setDividerLocation(200);

        treePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Photos");
        photoTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        photoTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                photoTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(photoTree);

        javax.swing.GroupLayout treePanelLayout = new javax.swing.GroupLayout(treePanel);
        treePanel.setLayout(treePanelLayout);
        treePanelLayout.setHorizontalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );
        treePanelLayout.setVerticalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(treePanel);

        uploadPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upload A Photo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        jLabel3.setText("Location :");

        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        browse.setText("Browse");
        browse.setToolTipText("Browse file location");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jLabel4.setText("Title :");

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        jLabel5.setText("Annotation :");

        annotation.setColumns(20);
        annotation.setRows(5);
        jScrollPane2.setViewportView(annotation);

        cancel.setText("Cancel");

        upload.setText("Upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        talert.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        talert.setForeground(new java.awt.Color(255, 0, 0));
        talert.setText("Only 20 chars at max for title !");

        aalert.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        aalert.setForeground(new java.awt.Color(255, 0, 0));
        aalert.setText("Only 100 chars at max for annotation !");

        javax.swing.GroupLayout uploadPaneLayout = new javax.swing.GroupLayout(uploadPane);
        uploadPane.setLayout(uploadPaneLayout);
        uploadPaneLayout.setHorizontalGroup(
            uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uploadPaneLayout.createSequentialGroup()
                        .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(uploadPaneLayout.createSequentialGroup()
                                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33)
                                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(location)
                                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
                            .addGroup(uploadPaneLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aalert)
                                    .addComponent(talert)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        uploadPaneLayout.setVerticalGroup(
            uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadPaneLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse))
                .addGap(18, 18, 18)
                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(talert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aalert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(uploadPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(upload))
                .addContainerGap())
        );

        displayPane.setPreferredSize(new java.awt.Dimension(531, 409));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        displayLayer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                displayLayerMouseMoved(evt);
            }
        });
        displayLayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayLayerMouseExited(evt);
            }
        });

        changePanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        changePanel.setToolTipText("");
        changePanel.setOpaque(false);
        changePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePanelMouseEntered(evt);
            }
        });

        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        outof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        outof.setText("6 ");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout changePanelLayout = new javax.swing.GroupLayout(changePanel);
        changePanel.setLayout(changePanelLayout);
        changePanelLayout.setHorizontalGroup(
            changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(outof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        changePanelLayout.setVerticalGroup(
            changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(previous)
                .addComponent(next)
                .addComponent(outof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        photoArea.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        photoArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                photoAreaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                photoAreaMouseEntered(evt);
            }
        });

        titleHover.setEditable(false);
        titleHover.setBackground(new java.awt.Color(50, 50, 50));
        titleHover.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        titleHover.setForeground(new java.awt.Color(242, 242, 242));
        titleHover.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        titleHover.setFocusable(false);
        titleHover.setOpaque(false);
        titleHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titleHoverMouseExited(evt);
            }
        });
        titleHover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleHoverActionPerformed(evt);
            }
        });

        annotationHover.setBackground(new java.awt.Color(1, 1, 1));
        annotationHover.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        annotationHover.setForeground(new java.awt.Color(1, 1, 1));
        annotationHover.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        annotationHover.setOpaque(false);
        annotationHover.setRequestFocusEnabled(false);
        annotationHover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                annotationHoverMouseEntered(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(35, 35, 35));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(246, 246, 246));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        jTextArea1.setOpaque(false);
        annotationHover.setViewportView(jTextArea1);

        displayLayer.setLayer(changePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayLayer.setLayer(photoArea, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayLayer.setLayer(titleHover, javax.swing.JLayeredPane.DEFAULT_LAYER);
        displayLayer.setLayer(annotationHover, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout displayLayerLayout = new javax.swing.GroupLayout(displayLayer);
        displayLayer.setLayout(displayLayerLayout);
        displayLayerLayout.setHorizontalGroup(
            displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayerLayout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(changePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
            .addGroup(displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayLayerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titleHover, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
            .addGroup(displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayLayerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(annotationHover, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        displayLayerLayout.setVerticalGroup(
            displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayerLayout.createSequentialGroup()
                    .addContainerGap(338, Short.MAX_VALUE)
                    .addComponent(changePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(displayLayerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(titleHover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
            .addGroup(displayLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayLayerLayout.createSequentialGroup()
                    .addContainerGap(229, Short.MAX_VALUE)
                    .addComponent(annotationHover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayLayer)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayLayer)
        );

        javax.swing.GroupLayout displayPaneLayout = new javax.swing.GroupLayout(displayPane);
        displayPane.setLayout(displayPaneLayout);
        displayPaneLayout.setHorizontalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayPaneLayout.setVerticalGroup(
            displayPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Purisa", 2, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Welcome to Photo Album");

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        layer.setLayer(uploadPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layer.setLayer(displayPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layer.setLayer(start, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerLayout = new javax.swing.GroupLayout(layer);
        layer.setLayout(layerLayout);
        layerLayout.setHorizontalGroup(
            layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uploadPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layerLayout.setVerticalGroup(
            layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uploadPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(displayPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layerLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jSplitPane1.setRightComponent(layer);

        slide.setPreferredSize(new java.awt.Dimension(740, 433));

        slideLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLayeredPane1.setLayer(jSplitPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(slide, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jMenu3.setText("File");

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Photo");

        jMenuItem2.setText("Upload a Photo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Slide Show");

        jMenuItem1.setText("Start");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Stop");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        layer.setVisible(true);
        uploadPane.setVisible(true);
        displayPane.setVisible(false);
        start.setVisible(false);
      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        
    }//GEN-LAST:event_titleActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser file =new JFileChooser();        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","bmp","png","gif"); 
        file.setFileFilter(filter);
        int result = file.showSaveDialog(null);
            if(result== JFileChooser.APPROVE_OPTION){
                File selectedFile = file.getSelectedFile();
                String path = selectedFile.getAbsolutePath();

                location.setText(path);

            }
            else if(result == JFileChooser.CANCEL_OPTION){
        
            }
        
    }//GEN-LAST:event_browseActionPerformed

    
    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        if(Integer.parseInt(photoCount.getText())==10){
            JOptionPane.showMessageDialog(null,"Maximum upload limit reached !");
            return;
        }
        images[Integer.parseInt(photoCount.getText())] = new Photo();
        
        if(title.getText().equals("")||(title.getText().length()>20)){
            Border border;
            border = BorderFactory.createLineBorder(Color.RED);
            title.setBorder(border);
            talert.setVisible(true);
            return;
        }
        else{
            Border border = BorderFactory.createLineBorder(Color.BLACK);
            title.setBorder(border);
            images[Integer.parseInt(photoCount.getText())].setTitle(title.getText());
        }
        if(annotation.getText().equals("")||(annotation.getText().length()>100)){
            Border border;
            border = BorderFactory.createLineBorder(Color.RED);
            annotation.setBorder(border);
            aalert.setVisible(true);
            return;
        }
        else{
            Border border = BorderFactory.createLineBorder(Color.BLACK);
            annotation.setBorder(border);
            images[Integer.parseInt(photoCount.getText())].setAnnotation(annotation.getText());
        }
        
        images[Integer.parseInt(photoCount.getText())].setLocation(location.getText());
        photoCount.setText(String.format("%d",Integer.parseInt(photoCount.getText())+1));
        jLabel2.setText(String.format("out of %d",Integer.parseInt(photoCount.getText())));
        setTree();
        uploadPane.setVisible(false);
        start.setVisible(true);
        refresh();
        
    }//GEN-LAST:event_uploadActionPerformed

    private void photoTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_photoTreeValueChanged
        String node = evt.getNewLeadSelectionPath().getLastPathComponent().toString();
        for(int i=0;i<Integer.parseInt(photoCount.getText());i++){
            if(node.equals(images[i].getTitle())){
                displayPane.setVisible(true);
                uploadPane.setVisible(false);
                start.setVisible(false);

                displayLayer.add(annotationHover,4,0);
                displayLayer.add(titleHover,3,0);
                displayLayer.add(changePanel,2,0);
                displayLayer.add(photoArea,1,0);
                    
                ImageIcon icon = new ImageIcon(images[i].getLocation());
                Image img =icon.getImage();
                Image newImg = img.getScaledInstance(photoArea.getWidth(),photoArea.getHeight(),Image.SCALE_DEFAULT);
                ImageIcon newicon = new ImageIcon(newImg);
                photoArea.setIcon(newicon);

                
                changePanel.setVisible(false);
                titleHover.setVisible(false);
                annotationHover.setVisible(false);
                titleHover.setText(images[i].getTitle());
                jTextArea1.setText(images[i].getAnnotation());
                
                Displayingimage =i ;
                outof.setText(String.format("%d",i+1));
                break;
            }
        }
    }//GEN-LAST:event_photoTreeValueChanged

    private void titleHoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleHoverActionPerformed
        
    }//GEN-LAST:event_titleHoverActionPerformed

    private void photoAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoAreaMouseEntered
        titleHover.setVisible(true);
        annotationHover.setVisible(true);
        changePanel.setVisible(true);
    }//GEN-LAST:event_photoAreaMouseEntered

    private void changePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePanelMouseEntered
        titleHover.setVisible(true);
        annotationHover.setVisible(true);
        changePanel.setVisible(true);
    }//GEN-LAST:event_changePanelMouseEntered

    private void titleHoverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleHoverMouseExited
       
    }//GEN-LAST:event_titleHoverMouseExited

    private void photoAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoAreaMouseExited
        titleHover.setVisible(false);
        annotationHover.setVisible(false);
    }//GEN-LAST:event_photoAreaMouseExited

    private void annotationHoverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_annotationHoverMouseEntered
        titleHover.setVisible(true);
        annotationHover.setVisible(true);
    }//GEN-LAST:event_annotationHoverMouseEntered

    private void displayLayerMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayLayerMouseMoved
         titleHover.setVisible(true);
        annotationHover.setVisible(true);
        changePanel.setVisible(true);
    }//GEN-LAST:event_displayLayerMouseMoved

    private void displayLayerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayLayerMouseExited

    }//GEN-LAST:event_displayLayerMouseExited

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        int i = Integer.parseInt(outof.getText());
        if(i == Integer.parseInt(photoCount.getText()))
            i = 0;
        ImageIcon icon = new ImageIcon(images[i].getLocation());
        Image img =icon.getImage();
        Image newImg = img.getScaledInstance(photoArea.getWidth(),photoArea.getHeight(),Image.SCALE_DEFAULT);
        ImageIcon newicon = new ImageIcon(newImg);
        photoArea.setIcon(newicon);

        changePanel.setVisible(false);
        titleHover.setVisible(false);
        annotationHover.setVisible(false);
        titleHover.setText(images[i].getTitle());
        jTextArea1.setText(images[i].getAnnotation());

        Displayingimage =i ;
        outof.setText(String.format("%d",i+1));
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        int i = Integer.parseInt(outof.getText())- 2;
        if(i == -1) 
            i = Integer.parseInt(photoCount.getText())-1;
        ImageIcon icon = new ImageIcon(images[i].getLocation());
        Image img =icon.getImage();
        Image newImg = img.getScaledInstance(photoArea.getWidth(),photoArea.getHeight(),Image.SCALE_DEFAULT);
        ImageIcon newicon = new ImageIcon(newImg);
        photoArea.setIcon(newicon);

        changePanel.setVisible(false);
        titleHover.setVisible(false);
        annotationHover.setVisible(false);
        titleHover.setText(images[i].getTitle());
        jTextArea1.setText(images[i].getAnnotation());

        Displayingimage =i ;
        outof.setText(String.format("%d",i+1));
    }//GEN-LAST:event_previousActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(Integer.parseInt(photoCount.getText())== 0){
            JOptionPane.showMessageDialog(null,"No images to display !");
            return;
        }
        stopSlide.setVisible(true);
        jSplitPane1.setVisible(false);
        slide.setVisible(true);
        slideshow = new Timer();
        slideshow.schedule(new TimerTask(){
            
            
            @Override
            public void run(){
                ImageIcon icon = new ImageIcon(images[x].getLocation());
                Image img =icon.getImage();
                Image newImg = img.getScaledInstance(slideLabel.getWidth(),slideLabel.getHeight(),Image.SCALE_DEFAULT);
                ImageIcon newicon = new ImageIcon(newImg);
                slideLabel.setIcon(newicon);
                x=x+1;
                if(x == Integer.parseInt(photoCount.getText()))
                    x = 0;
            }
        
        }, 2000, 2000);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        slideshow.cancel();
        jSplitPane1.setVisible(true);
        slide.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        layer.setVisible(true);
        uploadPane.setVisible(true);
        displayPane.setVisible(false);
        start.setVisible(false);
      
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void stopSlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSlideActionPerformed
        slideshow.cancel();
        jSplitPane1.setVisible(true);
        slide.setVisible(false);
        stopSlide.setVisible(false);
    }//GEN-LAST:event_stopSlideActionPerformed

    
    public void setTree(){
        DefaultTreeModel model = (DefaultTreeModel) photoTree.getModel();
        DefaultMutableTreeNode root =(DefaultMutableTreeNode) model.getRoot();
        
        int i=Integer.parseInt(photoCount.getText())-1;
        System.out.println("SDAfds  i :"+i+"  photo :"+photoCount.getText());
        DefaultMutableTreeNode dummy =new DefaultMutableTreeNode(images[i].getTitle());
        root.add(dummy);
        if(i==0)
            model.reload();
        else{
            model.insertNodeInto(dummy, root, i);
            model.reload(dummy);
        }
    }
    
    private void refresh(){
        location.setText("");
        title.setText("");
        annotation.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aalert;
    private javax.swing.JTextArea annotation;
    private javax.swing.JScrollPane annotationHover;
    private javax.swing.JButton browse;
    private javax.swing.JButton cancel;
    private javax.swing.JPanel changePanel;
    private javax.swing.JLayeredPane displayLayer;
    private javax.swing.JPanel displayPane;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLayeredPane layer;
    private javax.swing.JTextField location;
    private javax.swing.JButton next;
    private javax.swing.JLabel outof;
    private javax.swing.JLabel photoArea;
    private javax.swing.JLabel photoCount;
    private javax.swing.JTree photoTree;
    private javax.swing.JButton previous;
    private javax.swing.JPanel slide;
    private javax.swing.JLabel slideLabel;
    private javax.swing.JPanel start;
    private javax.swing.JButton stopSlide;
    private javax.swing.JLabel talert;
    private javax.swing.JTextField title;
    private javax.swing.JTextField titleHover;
    private javax.swing.JPanel treePanel;
    private javax.swing.JButton upload;
    private javax.swing.JButton uploadButton;
    private javax.swing.JPanel uploadPane;
    // End of variables declaration//GEN-END:variables
}
