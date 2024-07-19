package com.example.gestionparc;
import ParcVehicules.ParcVehicules;
import Vehicules.Vehicule;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nomFichier = "ATELIER  4 .txt";
        String texte = "texte.";
        try {
            FileWriter writer = new FileWriter(nomFichier, true); // 'true' pour ajouter à la fin du fichier
            writer.write(texte + "\n");
            writer.close();
            System.out.println("Le texte a été écrit avec succès dans " + nomFichier);
        } catch (IOException e) {
            e.printStackTrace();

        }



    ParcVehicules parc = new ParcVehicules();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nMenu :");
            System.out.println("1. Ajouter un véhicule");
            System.out.println("2. Supprimer un véhicule");
            System.out.println("3. Modifier un véhicule");
            System.out.println("4. Rechercher un véhicule");
            System.out.println("5. Lister les véhicules");
            System.out.println("6. Afficher le nombre de véhicules");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne
            switch (choix) {
                case 1:
                    System.out.print("Type de véhicule (Voiture, Camion, Moto) : ");
                    String type = scanner.nextLine();
                    System.out.print("ID : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Modèle : ");
                    String modele = scanner.nextLine();
                    Vehicule nouveauVehicule;
                    switch (type) {
                        case "Voiture":
                            System.out.print("Nombre de portes : ");
                            int nbPortes = scanner.nextInt();
                            scanner.nextLine();
                            nouveauVehicule = new Vehicule (id, marque, modele, nbPortes);

                        case "Camion":
                            System.out.print("enlargementMax : ");
                            int enlargementMax = scanner.nextInt();
                            scanner.nextLine();
                            nouveauVehicule = new Vehicule (id, marque, modele,enlargementMax);

                        case "Moto":
                            System.out.print("vitesse : ");
                            int cylinder = scanner.nextInt();
                            scanner.nextLine();
                            nouveauVehicule = new Vehicule (id, marque, modele,cylinder);

                        default:
                            System.out.println("Type de véhicule non reconnu.");

                    }
                case 2:
                    System.out.print("ID du véhicule à supprimer : ");
                    int idASupprimer = scanner.nextInt();
                    scanner.nextLine();
                    parc.supprimerVehicule(idASupprimer);
                    System.out.println("Véhicule supprimé avec succès.");
                    break;
                case 3:
                    System.out.print("ID du véhicule à modifier : ");
                    int idAModifier = scanner.nextInt();
                    scanner.nextLine();
                    Vehicule vehiculeAModifier =
                            parc.rechercherVehicule(String.valueOf(idAModifier));
                    if (vehiculeAModifier != null) {
                        System.out.println("Véhicule trouvé : " + vehiculeAModifier);
                        System.out.print("Nouvelle marque : ");
                        String nouvelleMarque = scanner.nextLine();
                        System.out.print("Nouveau modèle : ");
                        String nouveauModele = scanner.nextLine();
                        System.out.println("Véhicule modifié avec succès.");
                    } else {
                        System.out.println("Véhicule non trouvé.");
                    }
                    break;

                case 4:
                    System.out.print("Nom du véhicule à rechercher : ");
                    String nomARechercher = scanner.nextLine();
                    Vehicule vehiculeRecherche = parc.rechercherVehicule(nomARechercher);
                    if (vehiculeRecherche != null) {
                        System.out.println("Véhicule trouvé : " +
                                vehiculeRecherche);
                    } else {
                        System.out.println("Aucun véhicule trouvé.");
                    }
                    break;
                case 5:
                    System.out.print("Saisissez une lettre alphabétique : ");
                    char lettre = scanner.nextLine().toUpperCase().charAt(0);
                    System.out.println("Véhicules commençant par la lettre " + lettre + " :");
                    parc.listerVehicules(lettre);
                    break;
                case 6:
                    System.out.println("Nombre de véhicules dans le parc : " + parc.getNombreVehicules());
                    break;
                case 7:
                    System.exit(0);
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }}
