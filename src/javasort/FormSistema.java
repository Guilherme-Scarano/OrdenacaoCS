package javasort;
import java.io.*;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class FormSistema extends javax.swing.JFrame {
    ArrayList<Dados> lista = new ArrayList<>();
   // Definir os comparadores
    
    public FormSistema() {
        initComponents();
        carregaArquivo();
        
        
        // Configuração do evento de clique para o botão Busca Binária
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        // Configuração do evento de clique para o botão Busca Sequencial
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProx = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        radioPais = new javax.swing.JRadioButton();
        radioNick = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 153, 0));
        lblProx.setText("CSGO PLAYERS STATS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javasort/csgoLogo(1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Players", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 30), new java.awt.Color(240, 240, 240))); // NOI18N
        jPanel3.setMaximumSize(new java.awt.Dimension(30000, 30000));
        jPanel3.setPreferredSize(new java.awt.Dimension(1165, 457));

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Cidade", "Condição", "Tendencia", "Mínima", "Máxima", "Vento Min", "Vento Max", "Direção Vento"
            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nick", "País", "Mapas", "Rounds", "Kd", "Rating", "Kills", "Headshot", "Impacto" }));
        cbOrdena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrdenaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ordenação");

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pesquisa");

        jTextField1.setBorder(null);

        jButton1.setText("Binária");

        jButton2.setText("Sequencial");

        radioPais.setBackground(new java.awt.Color(102, 102, 102));
        radioPais.setLabel("País");

        radioNick.setBackground(new java.awt.Color(102, 102, 102));
        radioNick.setLabel("Nick");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbOrdena, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioNick, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(radioPais, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)))))))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioPais)
                            .addComponent(radioNick))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1167, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo(){
     String csvFile = "hltv_player.csv";
        String line = "";
        String[] leitura = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                Dados dados = new Dados();
                leitura = line.split(";");
                dados.setNick(leitura[0]);
                dados.setCountry(leitura[1]);
                dados.setMaps(leitura[2]);
                dados.setRounds(leitura[3]);
                dados.setKd(leitura[4]);
                dados.setRating(leitura[5]);
                dados.setTotalkills(leitura[6]);
                dados.setHeadshot(leitura[7]);
                dados.setImpact(leitura[8]);

                lista.add(dados); 
            }// fim percurso no arquivo
            mostra();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //https://1bestcsharp.blogspot.com/2016/03/java-populate-jtable-from-arraylist.html
    void mostra(){
        //limpando a tabela
        tabelaDados.setModel(new DefaultTableModel(null,new String[]{"Nick","País","Q. Mapas","Q. Rounds","KD","Rating","Kills Totais", "Headshot", "Impacto"}));
       
        DefaultTableModel model = 
                (DefaultTableModel)tabelaDados.getModel();
        Object rowData[] = new Object[9];// qtd colunas
        for(Dados d: lista)
        {
            rowData[0] = d.getNick();
            rowData[1] = d.getCountry();
            rowData[2] = d.getMaps();
            rowData[3] = d.getRounds();
            rowData[4] = d.getKd();
            rowData[5] = d.getRating();
            rowData[6] = d.getTotalkills();
            rowData[7] = d.getHeadshot();
            rowData[8] = d.getImpact();
            // System.out.println("TempMin:"+d.getTemperaturaMinima()+"\n");
            model.addRow(rowData);
        }// fim preenche modelo
    }// fim mostra
   
        
        Comparator<Dados> nickComparator = new Comparator<Dados>() {
         @Override
         public int compare(Dados dados1, Dados dados2) {
             return dados1.getNick().compareToIgnoreCase(dados2.getNick());
         }
     };
        Comparator<Dados> CountryComparator = new Comparator<Dados>() {
         @Override
         public int compare(Dados dados1, Dados dados2) {
             // Use compareToIgnoreCase para comparar ignorando o caso
             return dados1.getCountry().compareToIgnoreCase(dados2.getCountry());
         }
     };
        Comparator<Dados> mapsComparator = new Comparator<Dados>() {
         @Override
         public int compare(Dados dados1, Dados dados2) {
             // Use compareToIgnoreCase para comparar ignorando o caso
             return dados1.getMaps().compareToIgnoreCase(dados2.getMaps());
         }
     };
        Comparator<Dados> roundsComparator = new Comparator<Dados>() {
            @Override
            public int compare(Dados dados1, Dados dados2) {
                // Use compareToIgnoreCase para comparar ignorando o caso
                return dados1.getRounds().compareToIgnoreCase(dados2.getRounds());
            }
        };
        Comparator<Dados> KdComparator = new Comparator<Dados>() {
            @Override
            public int compare(Dados dados1, Dados dados2) {
                // Use compareToIgnoreCase para comparar ignorando o caso
                return dados1.getKd().compareToIgnoreCase(dados2.getKd());
            }
        };    
        Comparator<Dados> ratingComparator = new Comparator<Dados>() {
            @Override
            public int compare(Dados dados1, Dados dados2) {
                // Use compareToIgnoreCase para comparar ignorando o caso
                return dados1.getRating().compareToIgnoreCase(dados2.getRating());
            }
        };
        Comparator<Dados> totalKillsComparator = new Comparator<Dados>() {
            @Override
            public int compare(Dados dados1, Dados dados2) {
                // Use compareToIgnoreCase para comparar ignorando o caso
                return dados1.getTotalkills().compareToIgnoreCase(dados2.getTotalkills());
            }
        };
        Comparator<Dados> headshotComparator = new Comparator<Dados>() {
            @Override
            public int compare(Dados dados1, Dados dados2) {
                // Use compareToIgnoreCase para comparar ignorando o caso
                return dados1.getHeadshot().compareToIgnoreCase(dados2.getHeadshot());
            }
        };
        Comparator<Dados> impactComparator = new Comparator<Dados>() {
            @Override
            public int compare(Dados dados1, Dados dados2) {
                // Use compareToIgnoreCase para comparar ignorando o caso
                return dados1.getImpact().compareToIgnoreCase(dados2.getImpact());
            }
        };
     
     // Função de busca binária por nick
    private int buscaBinariaPorNick(String nick) {
        int comparacoes = 0;
        int esquerda = 0;
        int direita = lista.size() - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            Dados jogador = lista.get(meio);

            comparacoes++; // Incrementa o contador de comparações.

            int comparacaoNick = jogador.getNick().compareToIgnoreCase(nick);

            if (comparacaoNick == 0) {
                // O jogador foi encontrado, exiba-o na tabela e retorne o número de comparações.
                DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
                model.setRowCount(0); // Limpa a tabela.

                Object[] rowData = {
                    jogador.getNick(),
                    jogador.getCountry(),
                    jogador.getMaps(),
                    jogador.getRounds(),
                    jogador.getKd(),
                    jogador.getRating(),
                    jogador.getTotalkills(),
                    jogador.getHeadshot(),
                    jogador.getImpact()
                };

                model.addRow(rowData);
                return comparacoes;
            }

            if (comparacaoNick < 0) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; // Jogador não encontrado
    }

    // Função de busca sequencial por nick
    private int buscaSequencialPorNick(String nick) {
        int comparacoes = 0;

        for (int i = 0; i < lista.size(); i++) {
            Dados jogador = lista.get(i);
            comparacoes++; // Incrementa o contador de comparações.

            if (jogador.getNick().equalsIgnoreCase(nick)) {
                // O jogador foi encontrado, exiba-o na tabela e retorne o número de comparações.
                DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
                model.setRowCount(0); // Limpa a tabela.

                Object[] rowData = {
                    jogador.getNick(),
                    jogador.getCountry(),
                    jogador.getMaps(),
                    jogador.getRounds(),
                    jogador.getKd(),
                    jogador.getRating(),
                    jogador.getTotalkills(),
                    jogador.getHeadshot(),
                    jogador.getImpact()
                };

                model.addRow(rowData);
                return comparacoes;
            }
        }

        return -1; // Jogador não encontrado
    }
    //---------------------------------------------------------------------------------------------------------------------------------

    private int buscaBinariaPorPais(String country) {
        DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
        model.setRowCount(0); // Limpa a tabela.

        int left = 0;
        int right = lista.size() - 1;
        int comparacoes = 0; 

        while (left <= right) {
            int middle = left + (right - left) / 2;
            Dados jogador = lista.get(middle);
            comparacoes++; // Incrementa o contador de comparações.

            if (jogador.getCountry().equalsIgnoreCase(country)) {
                // Encontrou um jogador com o país desejado.
                // Adicione o jogador à tabela.
                Object[] rowData = {
                    jogador.getNick(),
                    jogador.getCountry(),
                    jogador.getMaps(),
                    jogador.getRounds(),
                    jogador.getKd(),
                    jogador.getRating(),
                    jogador.getTotalkills(),
                    jogador.getHeadshot(),
                    jogador.getImpact()
                };
                model.addRow(rowData);

                // Procure mais à esquerda e à direita para encontrar outros jogadores com o mesmo país.
                int leftPointer = middle - 1;
                int rightPointer = middle + 1;

                // Adicione todos os jogadores com o mesmo país à esquerda.
                while (leftPointer >= 0 && lista.get(leftPointer).getCountry().equalsIgnoreCase(country)) {
                    jogador = lista.get(leftPointer);
                    Object[] leftRowData = {
                        jogador.getNick(),
                        jogador.getCountry(),
                        jogador.getMaps(),
                        jogador.getRounds(),
                        jogador.getKd(),
                        jogador.getRating(),
                        jogador.getTotalkills(),
                        jogador.getHeadshot(),
                        jogador.getImpact()
                    };
                    model.addRow(leftRowData);
                    leftPointer--;
                }

                // Adicione todos os jogadores com o mesmo país à direita.
                while (rightPointer < lista.size() && lista.get(rightPointer).getCountry().equalsIgnoreCase(country)) {
                    jogador = lista.get(rightPointer);
                    Object[] rightRowData = {
                        jogador.getNick(),
                        jogador.getCountry(),
                        jogador.getMaps(),
                        jogador.getRounds(),
                        jogador.getKd(),
                        jogador.getRating(),
                        jogador.getTotalkills(),
                        jogador.getHeadshot(),
                        jogador.getImpact()
                    };
                    model.addRow(rightRowData);
                    rightPointer++;
                }

                return comparacoes; // Sai da função após encontrar e adicionar todos os jogadores com o mesmo país.
            } else if (jogador.getCountry().compareToIgnoreCase(country) < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return 0;
    }

        
    private int buscaSequencialPorPais(String country) {
            int comparacoes = 0;

            DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
            model.setRowCount(0); // Limpa a tabela.

            List<Dados> jogadoresEncontrados = new ArrayList<>();

            for (Dados jogador : lista) {
                comparacoes++;
                if (jogador.getCountry().equalsIgnoreCase(country)) {
                    // Adicione o jogador encontrado à lista intermediária.
                    jogadoresEncontrados.add(jogador);
                }
            }

            // Adicione todos os jogadores encontrados à tabela.
            for (Dados jogadorEncontrado : jogadoresEncontrados) {
                Object[] rowData = {
                    jogadorEncontrado.getNick(),
                    jogadorEncontrado.getCountry(),
                    jogadorEncontrado.getMaps(),
                    jogadorEncontrado.getRounds(),
                    jogadorEncontrado.getKd(),
                    jogadorEncontrado.getRating(),
                    jogadorEncontrado.getTotalkills(),
                    jogadorEncontrado.getHeadshot(),
                    jogadorEncontrado.getImpact()
                };
                model.addRow(rowData);
            }
            return comparacoes;
        }
    //---------------------------------------------------------------------------------------------------------------------------------
    
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Evento do botão de busca binária
        String textoBusca = jTextField1.getText().trim();
        

        if (radioNick.isSelected()) {
            // Realize a pesquisa binária com base no Nick
            int comparacoesPorNick = buscaBinariaPorNick(textoBusca);
            if (comparacoesPorNick != -1) {
                JOptionPane.showMessageDialog(this, "Jogador encontrado!\nComparações por Nick: " + comparacoesPorNick);
            } else {
                JOptionPane.showMessageDialog(this, "Jogador não encontrado!");
            }
        } else if (radioPais.isSelected()) {
            // Realize a pesquisa binária com base no País
            int comparacoesPorPais = buscaBinariaPorPais(textoBusca);
            JOptionPane.showMessageDialog(this, "País encontrado!\nComparações por País: " + comparacoesPorPais);
            if(comparacoesPorPais == -1){
                JOptionPane.showMessageDialog(this, "País não encontrado!");
            }
        }
    }

     private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Evento do botão de busca sequencial
        String textoBusca = jTextField1.getText().trim();

        if (radioNick.isSelected()) {
            // Realize a pesquisa sequencial com base no Nick
            int comparacoesPorNick = buscaSequencialPorNick(textoBusca);
            if (comparacoesPorNick != -1) {
                JOptionPane.showMessageDialog(this, "Jogador encontrado!\nComparações por Nick: " + comparacoesPorNick);
            } else {
                JOptionPane.showMessageDialog(this, "Jogador não encontrado!");
            }
        } else if (radioPais.isSelected()) {
            // Realize a pesquisa sequencial com base no País
            int comparacoesPorPais = buscaSequencialPorPais(textoBusca);
            JOptionPane.showMessageDialog(this, "País encontrado!\nComparações por País: " + comparacoesPorPais);
            if(comparacoesPorPais == -1){
                JOptionPane.showMessageDialog(this, "País não encontrado!");
            }
        }
    }              
    
    private void cbOrdenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrdenaActionPerformed
        // TODO add your handling code here:
        String selectedItem = cbOrdena.getSelectedItem().toString();

    // Use um switch-case para escolher por qual comparador ordenar
    switch (selectedItem) {
        case "Nick":
            Collections.sort(lista, nickComparator);
            break;
        case "País":
            Collections.sort(lista, CountryComparator);
            break;
        case "Mapas":
            Collections.sort(lista, mapsComparator);
            break;    
        case "Rounds":
            Collections.sort(lista, roundsComparator);
            break;  
        case "Kd":
            Collections.sort(lista, KdComparator);
            break;
        case "Rating":
            Collections.sort(lista, ratingComparator);
            break;
        case "Kills":
            Collections.sort(lista, totalKillsComparator);
            break;
        case "Headshot":
            Collections.sort(lista, headshotComparator);    
            break;
        case "Impacto":
            Collections.sort(lista, impactComparator);
            break;    
        
        default:
            // Ordenação padrão por Nome
            Collections.sort(lista, nickComparator);
            break;
    }//GEN-LAST:event_cbOrdenaActionPerformed

    // Atualize a tabela com os dados ordenados
        mostra();
    }                                        
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JRadioButton radioNick;
    private javax.swing.JRadioButton radioPais;
    private javax.swing.JTable tabelaDados;
    // End of variables declaration//GEN-END:variables
}
