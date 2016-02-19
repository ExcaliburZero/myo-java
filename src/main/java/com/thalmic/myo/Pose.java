package com.thalmic.myo;

import com.thalmic.myo.enums.PoseType;

public final class Pose {

    private final PoseType type;

    /**
     * Initializes a newly created <code>Pose</code> object so that it
     * represents a rest pose.
     */
    public Pose() {
        this(PoseType.REST);
    }

    /**
     * Initializes a newly created <code>Pose</code> object so that it
     * represents a pose with the type specified in the argument.
     *
     * @param type The <code>PoseType</code> of the pose.
     */
    public Pose(PoseType type) {
        this.type = type;
    }

    /**
     * Returns the type of this pose.
     *
     * @return The type of this pose.
     */
    public PoseType getType() {
        return type;
    }

    /**
     * Returns a hash code value for this object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    /**
     * Compares this pose to the specified object. The result is true if and
     * only if the argument is not <code>null</code> and is a <code>Pose</code>
     * object that represents the same pose as this object.
     *
     * @param obj The object to compare this <code>Pose</code> against.
     * @return <code>true</code> if the given object represents a
     * <code>Pose</code> equivalent to this pose, <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Pose other = (Pose) obj;
        if (type != other.type) {
            return false;
        }
        return true;
    }

    /**
     * Returns a string representing this pose.
     *
     * @return A string representing this pose.
     */
    @Override
    public String toString() {
        return "Pose [type=" + type + "]";
    }

}
