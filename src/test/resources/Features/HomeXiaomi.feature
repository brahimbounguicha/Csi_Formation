#author: csi
Feature: homePage Xiaomi

  Scenario: selectionner un menu
    Given utilisateur est sur la page dacceuil
    When utilisateur survole le souris sur le menu "Smart Home" et clique sur le submenu "Maison connectée"
    Then utilisateur est dirige vers la page "Maison Connectée"
