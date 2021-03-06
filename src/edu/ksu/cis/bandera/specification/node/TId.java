package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.analysis.*;

public final class TId extends Token
{
	public TId(String text)
	{
		setText(text);
	}
	public TId(String text, int line, int pos)
	{
		setText(text);
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTId(this);
	}
	public Object clone()
	{
	  return new TId(getText(), getLine(), getPos());
	}
}
