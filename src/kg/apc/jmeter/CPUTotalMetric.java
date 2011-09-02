/**
 * type - user, system, io, idle
 * core ID
 * process id
 * image name
 * 
 * 
 */
package kg.apc.jmeter;

import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.SigarProxy;

/**
 *
 * @author undera
 */
class CPUTotalMetric extends AbstractCPUMetric {

    public CPUTotalMetric(SigarProxy aSigar) {
        super(aSigar);
    }

    @Override
    public void getValue(StringBuilder res) throws SigarException {
        CpuPerc cpu = sigarProxy.getCpuPerc();
        sigarProxy.getCpuPercList();

        res.append(Double.toString(cpu.getCombined()));
    }
}
