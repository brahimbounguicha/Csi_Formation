#author: csi
Feature: Maison Connecte

  Scenario: effectuer le tri et cliquer sur un produit
    Given utilisateur est sur la page de maison connecte
    When utilisateur effectue le tri "Tri par popularité" et clique sur le produit "Xiaomi Smart Air Fryer 6.5 L"
    Then utilisateur est derigee vers la page du produit "Xiaomi Smart Air Fryer 6.5 L"
