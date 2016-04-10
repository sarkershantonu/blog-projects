using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products;

namespace AbstractFactory
{
    public abstract class Contractor
    {
        public abstract House makeHouse(string typeOfHouse);
        public House orderAhouse(string typeOfHouse)
        {
            House myHouse = makeHouse(typeOfHouse);
            myHouse.makehouse();
            myHouse.displayName();
            return myHouse;
        }
    }
}
