using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ObserverPattern
{
    public abstract class MyObservable
    {
        protected bool hasChanged = false;
        private List<MyObserver> observers = new List<MyObserver>();
        public void notifyAllOvservers()
        {
            foreach (var oserver in observers)
            {
                oserver.update();
            }
            hasChanged = false;
        }
        public void notifyAllOvservers(Object arg)
        {
            //Just another way to notify with arguments
            foreach (var oserver in observers)
            {
                oserver.update(arg);
            }
            hasChanged = false;
        }
        public MyObserver AddObserver
        {
            set{
                observers.Add(value);
            }
        }
        public MyObserver detachAObserver
        {
            set
            {
                observers.Remove(value);
            }
        }
        public int countObservers()
        {
            return observers.Count;
        }
        public abstract void setChange();
        public abstract void clearChange();
        public abstract bool hasChange();
        public MyObservable()
        {
        }
    }
}
