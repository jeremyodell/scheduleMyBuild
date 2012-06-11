package models;

import java.util.List;

import play.db.ebean.Model;

public class ScheduleBuild extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public boolean build;
	public boolean deploy;
	public List<String> environmentList;
	public String buildLabel;
	public Long buildLabelRevision;

	public ScheduleBuild() {

	}

	public ScheduleBuild(boolean build, boolean deploy, List<String> environmentList, String buildLabel,
			Long buildLabelRevision) {
		super();
		this.build = build;
		this.deploy = deploy;
		this.environmentList = environmentList;
		this.buildLabel = buildLabel;
		this.buildLabelRevision = buildLabelRevision;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ScheduleBuild [build=%s, deploy=%s, buildLabel=%s]", build, deploy, buildLabel);
	}

}
