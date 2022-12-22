package Lab4.a;

public abstract class Shape
{
    protected String color;
    protected boolean filled;
    abstract double getArea();
    abstract double getPerimeter();

    public Shape() {}

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    @Override
    public String toString()
    {
        if(filled == true)
        {
            return "Цвет - " + color + ", полностью закрашен";
        }
        else
        {
            return "Цвет - " + color + ", не закрашен";
        }
    }
}
