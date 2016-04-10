using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using AbstractFactory.Products.Items;

namespace AbstractFactory.Factories
{
    public interface IHouseBuilder
    {
        IDoor addDoor();
        IWindow addWindow();
        IToilet addToilet();
        IFurniture addFurniture();
    }
}
