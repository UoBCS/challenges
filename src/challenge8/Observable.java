package challenge8;

import java.util.ArrayList;

/**
 *
 * @author ossama
 */
public class Observable
{
    private boolean changed;
    private ArrayList<Observer> observers;
    
    public Observable()
    {
        changed = false;
    }
    
    public void addObserver(Observer o)
    {
        observers.add(o);
    }
    
    public void clearChanged()
    {
        changed = false;
    }
    
    public int countObservers()
    {
        return observers.size();
    }
    
    public void deleteObserver(Observer o)
    {
        observers.remove(o);
    }
    
    public void deleteObservers()
    {
        observers.clear();
    }
    
    public boolean hasChanged()
    {
        return changed;
    }
    
    public void notifyObservers()
    {
        if (changed)
        {
            observers.stream().forEach((observer) -> {
                observer.update(this, null);
            });
            
            clearChanged();
        }
    }
    
    public void notifyObservers(Object arg)
    {
        if (changed)
        {
            observers.stream().forEach((observer) -> {
                observer.update(this, arg);
            });
            
            clearChanged();
        }
    }
    
    public void setChanged()
    {
        changed = true;
    }
}