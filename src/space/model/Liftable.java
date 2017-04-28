package space.model;

/**
 * 
 * @author Grayson Corbett
 * I made it. Me! I did. It's all about pushing.
 */

public interface Liftable {
public static Boolean exists()
{
return false;
}

public static Boolean canBeTouched()
{
return false;
}

public static Boolean isTooHeavy(int weight)
{
return false;
}

public static Boolean hurtsToTouch()
{
return false;
}

}
