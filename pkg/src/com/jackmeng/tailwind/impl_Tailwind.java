package com.jackmeng.tailwind;

public abstract interface impl_Tailwind
{
  public void play();


  public void pause();

  public void close();

  public long time_ms();

  public default void stop()
  {
    close();
  }
}
