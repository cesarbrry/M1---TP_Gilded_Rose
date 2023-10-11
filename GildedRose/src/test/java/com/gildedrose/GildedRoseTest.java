package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

  @Test
  @DisplayName("[ TEST 1 ] : Test que la qualité descend pour un element different de sulfuras")
  void test1() {
    Item element = new Item("RandomName",10, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "[ L.26 - L.30 ] : Test OK / Quality decrease");
  }

  @Test
  @DisplayName("[ TEST 2 ] : Verification que le produit vielli à chaque boucle")
  void test2() {
    Item element = new Item("RandomName",10, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(9, element.sellIn, "[ L.42 - L.46 ] : Test OK / Sellin Decrease");
  }
 
  @Test
  @DisplayName("[ TEST 3 ] : Verif que la qualité ne depasse jamais la valeur 50")
  void test3() {
    Item element = new Item("RandomName",1, 51);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.42 - L.46 ] : Test OK / Quality don't change");
  }

  @Test
  @DisplayName("[ TEST 4 ] : Test de qualité lignes 26 - 30")
  void test4() {
    Item element = new Item("Aged Brie",1, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.26 - L.30 ] : Test OK / Quality increased");
  }

  
  @Test
  @DisplayName("[ TEST 5 ] : Test de qualité des lignes 32 - 38")
  void test5() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",10, 48);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.32 - L.38 ] : Test OK / Quality increased");
  }

  
  @Test
  @DisplayName("[ TEST 6 ] : Test de qualité meme en respectant pas la ligne 42")
  void test6() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",6, 48);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.42 ] : Test OK / Quality increased");
  }

  @Test
  @DisplayName("[ TEST 7 ] : Test des lignes 80-82")
  void test7() {
    Item element = new Item("Aged Brie",-1, 48);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.80 - L.82 ] : Test OK / Quality increased");
  }

  @Test
  @DisplayName("[ TEST 8 ] : Test des conditions Quality pour sulfuras( lignes 17 / 64)")
  void test8() {
    Item element = new Item("Sulfuras, Hand of Ragnaros",-1, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "[ L.17 - L.64 ] : Test OK / Quality don't change");
  }

  @Test
  @DisplayName("[ TEST 9 ] : Test des lignes 66-68")
  void test9() {
    Item element = new Item("Random Name",-1, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(47, element.quality, "[ L.66 - L.68 ] : Test OK / Quality decreased");
  }

  @Test
  @DisplayName("[ TEST 10 ] : Test de la ligne 74 ")
  void test10() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",-1, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "[ L.74 ] : Test OK / Quality decreased");
  }

  @Test
  @DisplayName("[ TEST 11 ] : Test que l'élément ne passe pas dans les boucles qui rejettent son nom")
  void test11() {
    Item element = new Item("Sulfuras, Hand of Ragnaros",-1, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals("Sulfuras, Hand of Ragnaros",element.name, "Test pour sulfuras qui ne change jamais");
  }

  @Test
  @DisplayName("[ TEST 12 ] : Test de condition sur les lignes 42 à 46")
  void test12() {
    Item element = new Item("Aged Brie",-1, 50);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.42 - L.46 ] : Test OK / Quality don't change");
  }
  

  @Test
  @DisplayName("[ TEST 13 ] : Test de condition sur les lignes 28 à 30")
  void test13() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",11, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.28 - L.30 ] : Test OK / Quality increased");
  }

  @Test
  @DisplayName("[ TEST 14 ] : Test de condition sur les lignes 32 à 38")
  void test14() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",10, 49);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.32 - L.38 ] : Test OK / Quality increased");
  }

  @Test
  @DisplayName("[ TEST 15 ] : Test de condition sur les lignes 42 à 46")
  void test15() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",5, 48);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(50, element.quality, "[ L.42 - L.46 ] : Test OK / Quality increased");
  }

  @Test
  @DisplayName("[ TEST 16 ] Test de la classe Item.Java : Phrase retournée")
  void test16() {
    Item element = new Item("Aged Brie",5, 48);
    assertEquals("Aged Brie, 5, 48", element.toString(), "[ Item.Java ] : Phrase OK");
  }

/* ------------------------------------- PYTEST ------------------------------------- */

@Test
  @DisplayName("[ TEST 17 ]")
  void test17() {
    Item element = new Item("RandomName",10, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "Quality don't change");
  }

@Test
  @DisplayName("[ TEST 18 ]")
  void test18() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",11, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(1, element.quality, "Quality increased");
  }
  
@Test
  @DisplayName("[ TEST 19 ]")
  void test19() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",1, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(4, element.quality, "Quality increased");
  }

@Test
  @DisplayName("[ TEST 20 ]")
  void test20() {
    Item element = new Item("Backstage passes to a TAFKAL80ETC concert",6, 1);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(3, element.quality, "Quality increased");
  }

@Test
  @DisplayName("[ TEST 21 ]")
  void test21() {
    Item element = new Item("RandomName",-1, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(0, element.quality, "Quality don'tchange");
  }



/* ------------------------------------- CONJURED ------------------------------------- */

@Test
  @DisplayName("[ TEST 22 ] : Verfication que la qualité diminue de 2 si jamais Sellin est superieur ou egal a 0")
  void test22() {
    Item element = new Item("Conjured",0, 50);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(48, element.quality, "TEST OK / Quality decreased by 2");
  }

@Test
  @DisplayName("[ TEST 23 ] : verification que la qualité diminue de 4 si jamais SellIn est a moins de 0")
  void test23() {
    Item element = new Item("Conjured",-1, 50);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertEquals(46, element.quality, "TEST OK / Quality decreased by 4");
  }

}