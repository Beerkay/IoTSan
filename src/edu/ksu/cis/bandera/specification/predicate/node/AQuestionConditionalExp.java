package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AQuestionConditionalExp extends PConditionalExp
{
	private POrExp _orExp_;
	private TQuestion _question_;
	private PExp _trueExp_;
	private TColon _colon_;
	private PConditionalExp _falseExp_;

	public AQuestionConditionalExp()
	{
	}
	public AQuestionConditionalExp(
		POrExp _orExp_,
		TQuestion _question_,
		PExp _trueExp_,
		TColon _colon_,
		PConditionalExp _falseExp_)
	{
		setOrExp(_orExp_);

		setQuestion(_question_);

		setTrueExp(_trueExp_);

		setColon(_colon_);

		setFalseExp(_falseExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAQuestionConditionalExp(this);
	}
	public Object clone()
	{
		return new AQuestionConditionalExp(
			(POrExp) cloneNode(_orExp_),
			(TQuestion) cloneNode(_question_),
			(PExp) cloneNode(_trueExp_),
			(TColon) cloneNode(_colon_),
			(PConditionalExp) cloneNode(_falseExp_));
	}
	public TColon getColon()
	{
		return _colon_;
	}
	public PConditionalExp getFalseExp()
	{
		return _falseExp_;
	}
	public POrExp getOrExp()
	{
		return _orExp_;
	}
	public TQuestion getQuestion()
	{
		return _question_;
	}
	public PExp getTrueExp()
	{
		return _trueExp_;
	}
	void removeChild(Node child)
	{
		if(_orExp_ == child)
		{
			_orExp_ = null;
			return;
		}

		if(_question_ == child)
		{
			_question_ = null;
			return;
		}

		if(_trueExp_ == child)
		{
			_trueExp_ = null;
			return;
		}

		if(_colon_ == child)
		{
			_colon_ = null;
			return;
		}

		if(_falseExp_ == child)
		{
			_falseExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_orExp_ == oldChild)
		{
			setOrExp((POrExp) newChild);
			return;
		}

		if(_question_ == oldChild)
		{
			setQuestion((TQuestion) newChild);
			return;
		}

		if(_trueExp_ == oldChild)
		{
			setTrueExp((PExp) newChild);
			return;
		}

		if(_colon_ == oldChild)
		{
			setColon((TColon) newChild);
			return;
		}

		if(_falseExp_ == oldChild)
		{
			setFalseExp((PConditionalExp) newChild);
			return;
		}

	}
	public void setColon(TColon node)
	{
		if(_colon_ != null)
		{
			_colon_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_colon_ = node;
	}
	public void setFalseExp(PConditionalExp node)
	{
		if(_falseExp_ != null)
		{
			_falseExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_falseExp_ = node;
	}
	public void setOrExp(POrExp node)
	{
		if(_orExp_ != null)
		{
			_orExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_orExp_ = node;
	}
	public void setQuestion(TQuestion node)
	{
		if(_question_ != null)
		{
			_question_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_question_ = node;
	}
	public void setTrueExp(PExp node)
	{
		if(_trueExp_ != null)
		{
			_trueExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_trueExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_orExp_)
			+ toString(_question_)
			+ toString(_trueExp_)
			+ toString(_colon_)
			+ toString(_falseExp_);
	}
}
