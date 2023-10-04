/**
 * Represents an insurance policy.
 */
public class Policy {
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private int height;
    private int weight;

    /**
     * Default constructor with default values.
     */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0;
        this.weight = 0;
    }

    /**
     * Constructor with specified values for policy details.
     * @param policyNumber The policy number.
     * @param providerName The name of the insurance provider.
     * @param firstName The first name of the policy holder.
     * @param lastName The last name of the policy holder.
     * @param age The age of the policy holder.
     * @param smokingStatus The smoking status of the policy holder (e.g., "smoker" or "non-smoker").
     * @param height The height of the policy holder in inches.
     * @param weight The weight of the policy holder in pounds.
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName, int age,
                  String smokingStatus, int height, int weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters with appropriate Javadoc comments

    /**
     * Gets the policy number.
     * @return The policy number.
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     * @param policyNumber The policy number to set.
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets the name of the insurance provider.
     * @return The provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the name of the insurance provider.
     * @param providerName The provider name to set.
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Gets the first name of the policy holder.
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the policy holder.
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the policy holder.
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the policy holder.
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the age of the policy holder.
     * @return The age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the policy holder.
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the smoking status of the policy holder.
     * @return The smoking status ("smoker" or "non-smoker").
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the smoking status of the policy holder.
     * @param smokingStatus The smoking status to set ("smoker" or "non-smoker").
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Gets the height of the policy holder in inches.
     * @return The height in inches.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the height of the policy holder in inches.
     * @param height The height to set in inches.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the weight of the policy holder in pounds.
     * @return The weight in pounds.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the policy holder in pounds.
     * @param weight The weight to set in pounds.
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Calculates the Body Mass Index (BMI) of the policy holder.
     * @return The BMI value.
     */
    public double calculateBMI() {
        return (weight * 703.0) / (height * height);
    }

    /**
     * Calculates the price of the insurance policy.
     * @return The total policy price.
     */
    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        if (age > 50) {
            additionalFee += 75.0;
        }

        if (smokingStatus.equals("smoker")) {
            additionalFee += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20.0;
        }

        return baseFee + additionalFee;
    }
}
