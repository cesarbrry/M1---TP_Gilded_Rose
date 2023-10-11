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

    static final String sulfuras="Sulfuras, Hand of Ragnaros";
    static final String concert="Backstage passes to a TAFKAL80ETC concert";
    static final String aged="Aged Brie";

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
            case sulfuras :
            break;

            case concert :

                this.quality += 1 ;
                    
                if (this.sellIn <= 0 )

                    {
                       this.quality = 0; 
                    }
                
                else if (this.sellIn < 11 && this.sellIn >= 6 )

                    {
                       this.quality += 1; 
                    }

                else if (this.sellIn < 6 )

                    {
                       this.quality += 2; 
                    }

                    sellIn -=1 ;


            break;

            case aged :
                if (this.sellIn < 0 )
                {
                    this.quality += 1;
                }
                
                this.quality += 1 ;
                sellIn -=1 ;

            break;

            default :
                if (this.quality > 0 )
                {
                    this.quality -= 1 ;
                }

                if (this.sellIn <= 0)
                {
                    this.quality -= 1 ;
                }

                sellIn -=1 ;

            break;

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
