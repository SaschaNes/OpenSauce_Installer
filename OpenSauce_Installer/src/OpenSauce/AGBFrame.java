/*
   *******************************************************************************
   *To define your own AGB text, go to design tab -> click on the defined text   *
   *-> click on properties on the right side -> click on the 3 dots on the right *
   *side of "text" -> type your AGB                                              *
   *******************************************************************************
*/
package OpenSauce;

import javax.swing.JOptionPane;

/**
 *
 * @author neste
 */
public class AGBFrame extends javax.swing.JFrame {


    public AGBFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox2 = new javax.swing.JCheckBox();
        agbCheckbox = new javax.swing.JCheckBox();
        agbLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        agbScrollPane = new javax.swing.JScrollPane();
        agbText = new javax.swing.JTextPane();

        jCheckBox2.setText("jCheckBox2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        agbCheckbox.setText("I accept the AGBs of this program!");

        agbLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        agbLabel.setText("Some text before the installation beginns :)");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        agbText.setEditable(false);
        agbText.setText("Copyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\nALLGEMEINE GESCHÄFTSBEDINGUNGEN (ONLINE-SHOP)\n§ 1 Geltungsbereich und Anbieter\n(1) Diese Allgemeinen Geschäftsbedingungen gelten für alle Bestellungen, die Sie\nbei dem Online-Shop der\nMuster GmbH\nMusterstraße\nMusterort\nGeschäftsführer:\ntätigen.\n(2) Das Warenangebot in unserem Online-Shop richtet sich ausschließlich an\nKäufer, die das 18. Lebensjahr vollendet haben.\n(3) Unsere Lieferungen, Leistungen und Angebote erfolgen ausschließlich auf der\nGrundlage dieser Allgemeinen Geschäftsbedingungen. Die Allgemeinen\nGeschäftsbedingungen gelten gegenüber Unternehmen somit auch für alle\nkünftigen Geschäftsbeziehungen, auch wenn sie nicht nochmals ausdrücklich\nvereinbart werden. Der Einbeziehung von Allgemeinen Geschäftsbedingungen\neines Kunden, die unseren Allgemeinen Geschäftsbedingungen\nwidersprechen, wird schon jetzt widersprochen.\n(4) Vertragssprache ist ausschließlich deutsch.\n(5) Sie können die derzeit gültigen Allgemeinen Geschäftsbedingungen auf der\nWebsite [Link angeben]\nabrufen und ausdrucken.\n§ 2 Vertragsschluss\n(1) Die Warenpräsentation im Online-Shop stellt keinen verbindlichen Antrag auf\nden Abschluss eines Kaufvertrages dar. Vielmehr handelt es sich um eine\nunverbindliche Aufforderung, im Online-Shop Waren zu bestellen.\n(2) Mit Anklicken des Buttons [„Jetzt zahlungspflichtig bestellen“ / „kaufen“]\ngeben Sie ein verbindliches Kaufangebot ab (§ 145 BGB). Unmittelbar vor\nAbgabe dieser Bestellung können Sie die Bestellung noch einmal überprüfen\nund ggf. korrigieren.\n(3) Nach Eingang des Kaufangebots erhalten Sie eine automatisch erzeugte EMail, mit der wir bestätigen, dass wir Ihre Bestellung erhalten haben\n(Eingangsbestätigung). Diese Eingangsbestätigung stellt noch keine Annahme\nIhres Kaufangebots dar. Ein Vertrag kommt durch die Eingangsbestätigung\nnoch nicht zustande.\nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\n(4) Ein Kaufvertrag über die Ware kommt erst zustande, wenn wir ausdrücklich\ndie Annahme des Kaufangebots erklären (Auftragsbestätigung) oder wenn wir\ndie Ware – ohne vorherige ausdrückliche Annahmeerklärung – an Sie\nversenden. Ausnahme: bei Zahlung mit Vorkasse und PayPal erfolgt die\nAnnahme der Bestellung unmittelbar mit Ihrer Bestellung.\n§ 3 Preise\nDie auf den Produktseiten genannten Preise enthalten die gesetzliche\nMehrwertsteuer und sonstige Preisbestandteile und verstehen sich zzgl. der\njeweiligen Versandkosten. Weitere Informationen zu den Versandkosten\nerhalten Sie auf unserer Internetseite unter [„Versandinformationen“ /\n„Lieferbedingungen“].\n§ 4 Zahlungsbedingungen; Verzug\n(1) Die Zahlung erfolgt wahlweise per:\nRechnung per Vorkasse,\nNachnahme,\nKreditkarte,\nPaypal oder\nLastschrift.\n(2) Die Auswahl der jeweils verfügbaren Bezahlmethoden obliegt uns. Wir\nbehalten uns insbesondere vor, Ihnen für die Bezahlung nur ausgewählte\nBezahlmethoden anzubieten, beispielweise zur Absicherung unseres\nKreditrisikos nur Vorkasse.\n(3) Bei Auswahl der Zahlungsart Vorkasse nennen wir Ihnen unsere\nBankverbindung in der Auftragsbestätigung. Der Rechnungsbetrag ist\ninnerhalb von 10 Tagen nach Erhalt der Auftragsbestätigung auf unser Konto\nzu überweisen.\n(4) Bei Zahlung per Nachnahme wird eine zusätzliche Gebühr in Höhe von [X] EUR\nfällig, die der Zusteller vor Ort erhebt. Weitere Kosten und Steuern fallen nicht\nan.\n(5) Bei Zahlung per Kreditkarte wird der Kaufpreis zum Zeitpunkt der Bestellung\nauf Ihrer Kreditkarte reserviert (Autorisierung). Die tatsächliche Belastung\nIhres Kreditkartenkontos erfolgt in dem Zeitpunkt, in dem wir die Ware an Sie\nversenden.\n(6) Bei der Bezahlung mit PayPal werden Sie im Bestellprozess auf die Webseite\ndes Online-Anbieters PayPal weitergeleitet. Um den Rechnungsbetrag über\nPayPal bezahlen zu können, müssen Sie dort registriert sein bzw. sich erst\nregistrieren, mit Ihren Zugangsdaten legitimieren und die Zahlungsanweisung\nan uns bestätigen. Nach Abgabe der Bestellung im Shop fordern wir PayPal\nzur Einleitung der Zahlungstransaktion auf. Weitere Hinweise erhalten Sie \nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\nbeim Bestellvorgang. Die Zahlungstransaktion wird durch PayPal unmittelbar\ndanach automatisch durchgeführt.\n(7) Bei Zahlung per Lastschrift haben Sie ggf. jene Kosten zu tragen, die infolge\neiner Rückbuchung einer Zahlungstransaktion mangels Kontodeckung oder\naufgrund von Ihnen falsch übermittelter Daten der Bankverbindung entstehen.\n(8) Geraten Sie mit einer Zahlung in Verzug, so sind Sie zur Zahlung der\ngesetzlichen Verzugszinsen in Höhe von 5 Prozentpunkten über dem\nBasiszinssatz verpflichtet. Für jedes Mahnschreiben, das nach Eintritt des\nVerzugs an Sie versandt wird, wird Ihnen eine Mahngebühr in Höhe von 2,50\nEUR berechnet, sofern nicht im Einzelfall ein niedrigerer bzw. höherer\nSchaden nachgewiesen wird.\n§ 5 Aufrechnung/Zurückbehaltungsrecht\n(1) Ein Recht zur Aufrechnung steht Ihnen nur dann zu, wenn Ihre Gegenforderung rechtskräftig festgestellt worden ist, von uns nicht bestritten oder\nanerkannt wird oder in einem engen synallagmatischen Verhältnis zu unserer\nForderung steht.\n(2) Sie können ein Zurückbehaltungsrecht nur ausüben, soweit Ihre Gegenforderung auf demselben Vertragsverhältnis beruht.\n§ 6 Lieferung; Eigentumsvorbehalt\n(1) Sofern nicht anders vereinbart, erfolgt die Lieferung der Ware von unserem\nLager an die von Ihnen angegebene Adresse.\n(2) Die Ware bleibt bis zur vollständigen Zahlung des Kaufpreises unser\nEigentum.\n(3) Wir sind ausnahmsweise nicht zur Lieferung der bestellten Ware verpflichtet,\nwenn wir die Ware unsererseits ordnungsgemäß bestellt haben, jedoch nicht\nrichtig oder rechtzeitig beliefert wurden (kongruentes Deckungsgeschäft).\nVoraussetzung ist, dass wir die fehlende Warenverfügbarkeit nicht zu\nvertreten haben und Sie über diesen Umstand unverzüglich informiert haben.\nZudem dürfen wir nicht das Risiko der Beschaffung der bestellten Ware\nübernommen haben. Bei entsprechender Nichtverfügbarkeit der Ware werden\nwir Ihnen bereits geleistete Zahlungen unverzüglich erstatten. Das Risiko, eine\nbestellte Ware besorgen zu müssen (Beschaffungsrisiko), übernehmen wir\nnicht. Dies gilt auch bei der Bestellung von Waren, die nur ihrer Art und ihren\nMerkmalen nach beschrieben ist (Gattungswaren). Wir sind nur zur Lieferung\naus unserem Warenvorrat und der von uns bei unseren Lieferanten bestellten\nWaren verpflichtet.\n(4) Wenn Sie Unternehmer im Sinne des § 14 BGB sind, gilt ergänzend Folgendes:\n- Wir behalten uns das Eigentum an der Ware bis zum vollständigen\nAusgleich aller Forderungen aus der laufenden Geschäftsbeziehung vor. \nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\nVor Übergang des Eigentums an der Vorbehaltsware ist eine Verpfändung\noder Sicherheitsübereignung nicht zulässig.\n- Sie dürfen die Ware im ordentlichen Geschäftsgang weiterverkaufen. Für\ndiesen Fall treten Sie bereits jetzt alle Forderungen in Höhe des\nRechnungsbetrages, die Ihnen aus dem Weiterverkauf erwachsen, an uns\nab. Wir nehmen die Abtretung an, Sie sind jedoch zur Einziehung der\nForderungen ermächtigt. Soweit Sie Ihren Zahlungsverpflichtungen nicht\nordnungsgemäß nachkommen, behalten wir uns das Recht vor,\nForderungen selbst einzuziehen.\n- Bei Verbindung und Vermischung der Vorbehaltsware erwerben wir\nMiteigentum an der neuen Sache im Verhältnis des Rechnungswertes der\nVorbehaltsware zu den anderen verarbeiteten Gegenständen zum\nZeitpunkt der Verarbeitung.\n- Wir verpflichteten uns, die uns zustehenden Sicherheiten auf Verlangen\ninsoweit freizugeben, als der realisierbare Wert unserer Sicherheiten die\nzu sichernden Forderungen um mehr als 10 % übersteigt. Die Auswahl der\nfreizugebenden Sicherheiten obliegt uns.\n§ 7 Widerrufsbelehrung\nFür den Fall, dass Sie Verbraucher im Sinne des § 13 BGB sind, also den Kauf zu\nZwecken tätigen, die überwiegend weder Ihrer gewerblichen noch Ihrer\nselbständigen beruflichen Tätigkeit zugerechnet werden können, haben Sie ein\nWiderrufsrecht nach Maßgabe der folgenden Bestimmungen.\nWiderrufsrecht\nSie haben das Recht, binnen vierzehn Tagen ohne Angabe von Gründen diesen\nVertrag zu widerrufen.\nDie Widerrufsfrist beträgt vierzehn Tage ab dem Tag, an dem Sie oder ein von\nIhnen benannter Dritter, der nicht der Beförderer ist, die Waren in Besitz\ngenommen haben bzw. hat.\nUm Ihr Widerrufsrecht auszuüben, müssen Sie uns\nFirma:\nAdresse:\nE-Mail:\nTelefon:\nFax:\nmittels einer eindeutigen Erklärung (z. B. ein mit der Post versandter Brief,\nTelefax oder E-Mail) über Ihren Entschluss, diesen Vertrag zu widerrufen, \nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\ninformieren. Sie können dafür das beigefügte Muster-Widerrufsformular\nverwenden, das jedoch nicht vorgeschrieben ist.\nZur Wahrung der Widerrufsfrist reicht es aus, dass Sie die Mitteilung über die\nAusübung des Widerrufsrechts vor Ablauf der Widerrufsfrist absenden.\nFolgen des Widerrufs\nWenn Sie diesen Vertrag widerrufen, haben wir Ihnen alle Zahlungen, die wir\nvon Ihnen erhalten haben, einschließlich der Lieferkosten (mit Ausnahme der\nzusätzlichen Kosten, die sich daraus ergeben, dass Sie eine andere Art der\nLieferung als die von uns angebotene, günstigste Standardlieferung gewählt\nhaben), unverzüglich und spätestens binnen vierzehn Tagen ab dem Tag\nzurückzuzahlen, an dem die Mitteilung über Ihren Widerruf dieses Vertrags bei\nuns eingegangen ist. Für diese Rückzahlung verwenden wir dasselbe\nZahlungsmittel, das Sie bei der ursprünglichen Transaktion eingesetzt haben,\nes sei denn, mit Ihnen wurde ausdrücklich etwas anderes vereinbart; in keinem\nFall werden Ihnen wegen dieser Rückzahlung Entgelte berechnet.\nWir können die Rückzahlung verweigern, bis wir die Waren wieder zurückerhalten haben oder bis Sie den Nachweis erbracht haben, dass Sie die Waren\nzurückgesandt haben, je nachdem, welches der frühere Zeitpunkt ist.\nSie haben die Waren unverzüglich und in jedem Fall spätestens binnen vierzehn\nTagen ab dem Tag, an dem Sie uns über den Widerruf dieses Vertrags\nunterrichten, an uns oder an [ggf. Name und Anschrift einer von Ihnen zur\nEntgegennahme der Ware berechtigten Person] zurückzusenden oder zu\nübergeben. Die Frist ist gewahrt, wenn Sie die Waren vor Ablauf der Frist von\nvierzehn Tagen absenden.\nSie tragen die unmittelbaren Kosten der Rücksendung der Waren.\nSie müssen für einen etwaigen Wertverlust der Waren nur aufkommen, wenn\ndieser Wertverlust auf einen zur Prüfung der Beschaffenheit, Eigenschaften und\nFunktionsweise der Waren nicht notwendigen Umgang mit ihnen\nzurückzuführen ist. \nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\nMuster-Widerrufsformular\nWenn Sie den Vertrag widerrufen wollen, dann füllen Sie bitte dieses Formular aus\nund senden Sie es zurück.\nAn\nFirma:\nAdresse:\nE-Mail:\nFax:\nHiermit widerrufe(n) ich/wir (*) den von mir/uns (*) abgeschlossenen Vertrag über\nden Kauf der folgenden Waren (*):\nBestellt am (*)/erhalten am (*)\nName des/der Verbraucher(s):\nAnschrift des/der Verbraucher(s):\nUnterschrift des/der Verbraucher(s) (nur bei Mitteilung auf Papier)\nDatum\n(*) Unzutreffendes streichen.\nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\nEnde der Widerrufsbelehrung\n(1) Das Widerrufsrecht besteht nicht bei der Lieferung\n- von Waren, die nicht vorgefertigt sind und für deren Herstellung eine\nindividuelle Auswahl oder Bestimmung durch den Verbraucher\nmaßgeblich ist oder die eindeutig auf die persönlichen Bedürfnisse des\nVerbrauchers zugeschnitten sind (z. B. T-Shirts mit Ihrem Foto und Ihrem\nNamen),\n- versiegelter Waren, die aus Gründen des Gesundheitsschutzes oder der\nHygiene nicht zur Rückgabe geeignet sind, wenn ihre Versiegelung nach\nder Lieferung entfernt wurde,\n- von Waren, wenn diese nach der Lieferung auf Grund ihrer Beschaffenheit\nuntrennbar mit anderen Gütern vermischt wurden,\n- von Ton- oder Videoaufnahmen oder Computersoftware in einer\nversiegelten Packung, wenn die Versiegelung nach der Lieferung entfernt\nwurde,\n- von Zeitungen, Zeitschriften oder Illustrierten mit Ausnahme von\nAbonnement-Verträgen.\n(2) Bitte vermeiden Sie Beschädigungen und Verunreinigungen. Senden Sie die\nWare bitte möglichst in Originalverpackung mit sämtlichem Zubehör und mit\nallen Verpackungsbestandteilen an uns zurück. Verwenden Sie ggf. eine\nschützende Umverpackung. Wenn Sie die Originalverpackung nicht mehr\nbesitzen, sorgen Sie bitte mit einer geeigneten Verpackung für einen\nausreichenden Schutz vor Transportschäden, um Schadensersatzansprüche\nwegen Beschädigungen infolge mangelhafter Verpackung zu vermeiden.\n(3) Bitte rufen Sie vor Rücksendung unter der [Tel.Nr.] bei uns an, um die\nRücksendung anzukündigen. Auf diese Weise ermöglichen Sie uns eine\nschnellstmögliche Zuordnung der Produkte.\n(4) Bitte beachten Sie, dass die in den vorstehenden Absätzen 2 und 3 genannten\nModalitäten nicht Voraussetzung für die wirksame Ausübung des Widerrufsrechts sind.\n§ 8 Transportschäden\n(1) Werden Waren mit offensichtlichen Transportschäden angeliefert, so\nreklamieren Sie solche Fehler bitte sofort bei dem Zusteller und nehmen Sie\nbitte schnellstmöglich Kontakt zu uns auf.\nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\n(2) Die Versäumung einer Reklamation oder Kontaktaufnahme hat für Ihre\ngesetzlichen Gewährleistungsrechte keine Konsequenzen. Sie helfen uns aber,\nunsere eigenen Ansprüche gegenüber dem Frachtführer bzw. der\nTransportversicherung geltend machen zu können.\n§ 9 Gewährleistung\n(1) Soweit nicht ausdrücklich etwas anderes vereinbart ist, richten sich Ihre\nGewährleistungsansprüche nach den gesetzlichen Bestimmungen des\nKaufrechts (§§ 433 ff. BGB).\n(2) Wenn Sie Verbraucher im Sinne des § 13 BGB sind, beträgt\ndie Haftungsdauer für Gewährleistungsansprüche bei gebrauchten Sachen -\nabweichend von den gesetzlichen Bestimmungen - ein Jahr. Diese\nBeschränkung gilt nicht für Ansprüche aufgrund von Schäden aus der\nVerletzung des Lebens, des Körpers oder der Gesundheit oder aus der\nVerletzung einer wesentlichen Vertragspflicht, deren Erfüllung die\nordnungsgemäße Durchführung des Vertrags überhaupt erst ermöglicht und\nauf deren Einhaltung der Vertragspartner regelmäßig vertrauen darf\n(Kardinalpflicht) sowie für Ansprüche aufgrund von sonstigen Schäden, die\nauf einer vorsätzlichen oder grob fahrlässigen Pflichtverletzung des\nVerwenders oder seiner Erfüllungsgehilfen beruhen.\n(3) Im Übrigen gelten für die Gewährleistung die gesetzlichen Bestimmungen,\ninsbesondere die zweijährige Verjährungsfrist gem. § 438 Abs. 1 Nr. 3 BGB.\n(4) Wenn Sie Unternehmer im Sinne des § 14 BGB sind, gelten die gesetzlichen\nBestimmungen mit folgenden Modifikationen:\n- Für die Beschaffenheit der Ware sind nur unsere eigenen Angaben und die\nProduktbeschreibung des Herstellers verbindlich, nicht jedoch öffentliche\nAnpreisungen und Äußerungen und sonstige Werbung des Herstellers.\n- Sie sind verpflichtet, die Ware unverzüglich und mit der gebotenen\nSorgfalt auf Qualitäts- und Mengenabweichungen zu untersuchen und uns\noffensichtliche Mängel binnen 7 Tagen ab Empfang der Ware anzuzeigen.\nZur Fristwahrung reicht die rechtzeitige Absendung. Dies gilt auch für\nspäter festgestellte verdeckte Mängel ab Entdeckung. Bei Verletzung der\nUntersuchungs- und Rügepflicht ist die Geltendmachung der Gewährleistungsansprüche ausgeschlossen.\n- Bei Mängeln leisten wir nach unserer Wahl Gewähr durch Nachbesserung\noder Ersatzlieferung (Nacherfüllung). Im Falle der Nachbesserung müssen\nwir nicht die erhöhten Kosten tragen, die durch die Verbringung der Ware\nan einen anderen Ort als den Erfüllungsort entstehen, sofern die\nVerbringung nicht dem bestimmungsgemäßen Gebrauch der Ware\nentspricht.\n- Schlägt die Nacherfüllung zweimal fehl, können Sie nach Ihrer Wahl\nMinderung verlangen oder vom Vertrag zurücktreten.\n- Die Gewährleistungsfrist beträgt ein Jahr ab Ablieferung der Ware.\nCopyright: HÄRTING Rechtsanwälte, www.haerting.de, vertragstexte@haerting.de\nChausseestraße 13,10115 Berlin, Tel. (030) 28 30 57 40, Fax (030) 28 30 57 4\n§ 10 Haftung\n(1) Unbeschränkte Haftung: Wir haften unbeschränkt für Vorsatz und grobe\nFahrlässigkeit sowie nach Maßgabe des Produkthaftungsgesetzes. Für leichte\nFahrlässigkeit haften wir bei Schäden aus der Verletzung des Lebens, des\nKörpers und der Gesundheit von Personen.\n(2) Im Übrigen gilt folgende beschränkte Haftung: Bei leichter Fahrlässigkeit\nhaften wir nur im Falle der Verletzung einer wesentlichen Vertragspflicht,\nderen Erfüllung die ordnungsgemäße Durchführung des Vertrags überhaupt\nerst ermöglicht und auf deren Einhaltung Sie regelmäßig vertrauen dürfen\n(Kardinalpflicht). Die Haftung für leichte Fahrlässigkeit ist der Höhe nach\nbeschränkt auf die bei Vertragsschluss vorhersehbaren Schäden, mit deren\nEntstehung typischerweise gerechnet werden muss. Diese Haftungsbeschränkung gilt auch zugunsten unserer Erfüllungsgehilfen.\n§ 11 Alternative Streitbeilegung\nDie EU-Kommission hat eine Plattform für außergerichtliche Streitschlichtung\nbereitgestellt. Verbrauchern gibt dies die Möglichkeit, Streitigkeiten im\nZusammenhang mit Ihrer Online-Bestellung zunächst ohne die Einschaltung eines\nGerichts zu klären. Die Streitbeilegungs-Plattform ist unter dem externen Link\nhttp://ec.europa.eu/consumers/odr/ erreichbar.\nWir sind bemüht, eventuelle Meinungsverschiedenheiten aus unserem Vertrag\neinvernehmlich beizulegen. Darüber hinaus sind wir zu einer Teilnahme an einem\nSchlichtungsverfahren nicht verpflichtet und können Ihnen die Teilnahme an einem\nsolchen Verfahren leider auch nicht anbieten.\n§ 12 Schlussbestimmungen\n(1) Sollten eine oder mehrere Bestimmungen dieser AGB unwirksam sein oder\nwerden, wird dadurch die Wirksamkeit der anderen Bestimmungen im Übrigen\nnicht berührt.\n(2) Auf Verträge zwischen uns und Ihnen ist ausschließlich deutsches Recht\nanwendbar unter Ausschluss der Bestimmungen der United Nations\nConvention on Contracts for the International Sale of Goods (CISG, „UNKaufrecht“). Zwingende Bestimmungen des Landes, in dem Sie sich\ngewöhnlich aufhalten, bleiben von der Rechtswahl unberührt.\n(3) Sind Sie Kaufmann, juristische Person des öffentlichen Rechts oder öffentlichrechtliches Sondervermögen, so ist unser Geschäftssitz Gerichtsstand für alle\nStreitigkeiten aus oder im Zusammenhang mit Verträgen zwischen uns und\nIhnen.\nStand: Monat, Jahr");
        agbScrollPane.setViewportView(agbText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agbCheckbox)
                    .addComponent(agbLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(cancelButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nextButton))
                        .addComponent(agbScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agbLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agbScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agbCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextButton)
                    .addComponent(cancelButton))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // before exit the program asks the user if he really want's to quit the installer
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        String[] options = {"Yes", "No"};
        int exitQuestion = JOptionPane.showOptionDialog(null, "Do you really want to cance the installation?", "Information", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (exitQuestion == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    
    // checks if agbCheckbox is checked
        // no   : gives out an dialog that the user needs to agree to them
        // yes  : closes the current window and opens InstallerFrame
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (!(agbCheckbox.isSelected())) {
            JOptionPane.showMessageDialog(this, "You need to agree to the AGBs!"); // <- Insert your text here for accepting the AGB's
        } else {
            this.dispose();
            InstallerFrame nextWindowInstallerFrame = new InstallerFrame();
            nextWindowInstallerFrame.pack();
            nextWindowInstallerFrame.setVisible(true);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AGBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AGBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AGBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AGBFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AGBFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agbCheckbox;
    private javax.swing.JLabel agbLabel;
    private javax.swing.JScrollPane agbScrollPane;
    private javax.swing.JTextPane agbText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
