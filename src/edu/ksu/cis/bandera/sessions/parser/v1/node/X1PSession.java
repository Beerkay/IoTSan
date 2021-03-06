/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.sessions.parser.v1.node;

import edu.ksu.cis.bandera.sessions.parser.v1.analysis.*;

public final class X1PSession extends XPSession
{
    private XPSession _xPSession_;
    private PSession _pSession_;

    public X1PSession()
    {
    }

    public X1PSession(
        XPSession _xPSession_,
        PSession _pSession_)
    {
        setXPSession(_xPSession_);
        setPSession(_pSession_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPSession getXPSession()
    {
        return _xPSession_;
    }

    public void setXPSession(XPSession node)
    {
        if(_xPSession_ != null)
        {
            _xPSession_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPSession_ = node;
    }

    public PSession getPSession()
    {
        return _pSession_;
    }

    public void setPSession(PSession node)
    {
        if(_pSession_ != null)
        {
            _pSession_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pSession_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPSession_ == child)
        {
            _xPSession_ = null;
        }

        if(_pSession_ == child)
        {
            _pSession_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPSession_) +
            toString(_pSession_);
    }
}
