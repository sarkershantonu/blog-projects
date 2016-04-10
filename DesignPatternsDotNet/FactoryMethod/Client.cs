using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FactoryMethod
{
    public enum Products { pen,pencil,eraser}
    public class Client
    {
        public static void Main(string[] args)
        {
            IFactory creator = new Factory(Products.pen);
            DeliverProductToAShop(creator);
            creator = new Factory(Products.pencil);
            DeliverProductToAShop(creator);
            Console.ReadLine();
        }
        public static void DeliverProductToAShop(IFactory aFactory)
        {
            IProduct aProduct = aFactory.CreateProduct();
            aProduct.ShowMe();
        }
    }
}
