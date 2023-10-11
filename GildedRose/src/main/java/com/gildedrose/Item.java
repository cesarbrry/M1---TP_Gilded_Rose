package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    static final String sulfuras = "Sulfuras, Hand of Ragnaros";
    static final String concert  = "Backstage passes to a TAFKAL80ETC concert";
    static final String aged     = "Aged Brie";
    static final String conjured = "Conjured";

    public void UpdateItem()
    {
        updateQuality();
        if ( this.quality<0 || this.quality>50)
        {
            QualityBoundary();
        }
    }
    
    public void updateQuality()
    {
        switch(this.name)
        {
            case sulfuras : // Rien ne se passe pour Sulfuras, c'est une carte legendaire
            break;

            case concert : // Concert : Si sellin est inf a 6 : Qualité + 2 / Si sellin entre 11 et 6 : Qualité + 1 / si Sellin inf a 0 : Qualite egale a 0

                this.quality += 1 ;
                    
                if      ( this.sellIn <= 0 ) { this.quality  = 0; }
                else if ( this.sellIn < 11 && this.sellIn >= 6 ) { this.quality += 1; }
                else if ( this.sellIn < 6 )  { this.quality += 2; }

                this.sellIn -=1 ;

            break;

            case aged : // Si sellin est inf a 0, la qualité augmente de 1 / Si sellin est sup a 0, la qualité augmente de 1
                
                if ( this.sellIn < 0 ) { this.quality += 1; }
                
                this.quality += 1 ;
                sellIn -=1 ;

            break ;

            case conjured : // Si sellin est supeq a 0, la qualité baisse de 2 / Si sellin est inf a 0, la qualité baisse de 4
                
                if ( this.sellIn >= 0 ) { this.quality -= 2; }
                else { this.quality -= 4; }

                this.sellIn -= 1 ;
            
            break ;

            default : // Si sellin est infeq a 0, la qualité baisse de 1 / Pareil si la qualite est superieure a 0

                if ( this.quality > 0 ) { this.quality -= 1 ; }
                if ( this.sellIn <= 0 ) { this.quality -= 1 ; }

                sellIn -=1 ;

            break ;

        }
    }

    public void QualityBoundary()
    {
        if (this.quality > 50)
        {
            this.quality = 50 ;
        }

        else if (this.quality<0)
        {
            this.quality = 0 ;
        }
    }


   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
