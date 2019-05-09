package com.java.gzh.test;


import java.io.Serializable;
import java.util.Date;



public class DateRange implements Serializable {
	private static final long serialVersionUID = 2666991786271557817L;

	/**
	 * 不要对该对象进行修改赋值等更改操作！
	 */
	public static final DateRange NULL = new DateRangeNull();

	private static class DateRangeNull extends DateRange {
		private static final long serialVersionUID = 6770621745206338562L;

		@Override
		public DateRange start(Date start) {
			return this;
		}

		@Override
		public DateRange end(Date end) {
			return this;
		}

		@Override
		public void setStart(Date start) {
		}

		@Override
		public void setEnd(Date end) {
		}
	}

	private Date start;

	private Date end;

	public DateRange() {
		super();
	}

	public DateRange(Date start, Date end) {
		super();
		this.start = start;
		this.end = end;
	}

	public static DateRange New() {
		return new DateRange();
	}

	public DateRange start(Date start) {
		this.start = start;
		return this;
	}

	public DateRange end(Date end) {
		this.end = end;
		return this;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	@Override
	public String toString() {

		return "";
	}
}
